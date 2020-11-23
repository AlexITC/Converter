package org.scalablytyped.converter.internal
package scalajs

object Versions {
  val sbtVersion = "1.4.2"

  private val StableVersion = "(\\d+).(\\d+).(\\d+)".r
  private val Milestone     = "(.+)-bin-(.+)".r

  case class Scala(scalaVersion: String) {
    val isDotty = scalaVersion.startsWith("3.")

    val scalaOrganization: String =
      "org.scala-lang"

    val compiler: Dep =
      if (isDotty) Dep.Scala(scalaOrganization, "scala3-compiler", scalaVersion)
      else Dep.Java(scalaOrganization, "scala-compiler", scalaVersion)

    val library: Dep.Java =
      if (isDotty) Scala213.library
      else Dep.Java(scalaOrganization, "scala-library", scalaVersion)

    val dottyLibrary: Option[Dep.Java] =
      if (isDotty) Some(Dep.Java(scalaOrganization, "dotty-library", scalaVersion))
      else None

    val binVersion: String = scalaVersion match {
      case StableVersion(major, minor, _) => s"$major.$minor"
      case Milestone(bin, _)              => bin
      case other                          => other
    }

    val sbtDotty: Option[Dep.Scala] = {
      if (isDotty) Some(Dep.Scala("ch.epfl.lamp", "sbt-dotty", "0.4.6")) else None
    }
  }

  val Scala212 = Scala("2.12.11")
  val Scala213 = Scala("2.13.3")
  val Dotty    = Scala("3.0.0-M2")

  case class ScalaJs(scalaJsVersion: String) {
    val scalaJsBinVersion: String =
      scalaJsVersion match {
        case StableVersion("1", _, _)   => "1"
        case StableVersion("0", "6", _) => "0.6"
        case other                      => other
      }

    val scalaJsOrganization = "org.scala-js"
    val sbtPlugin           = Dep.Scala(scalaJsOrganization, "sbt-scalajs", scalaJsVersion)
  }

  val ScalaJs1 = ScalaJs("1.3.0")
}

case class Versions(scala: Versions.Scala, scalaJs: Versions.ScalaJs) {
  val scalacOptions: List[String] = {
    List(
      "-encoding",
      "utf-8",
      "-feature",
      "-g:notailcalls",
      "-language:implicitConversions",
      "-language:higherKinds",
      "-language:existentials",
    ).filter {
      case str if scala.isDotty => str =/= "-g:notailcalls" // keep original order
      case _                    => true
    }
  }

  val scalaJsLibrary: Dep =
    Dep
      .Scala(scalaJs.scalaJsOrganization, "scalajs-library", scalaJs.scalaJsVersion)
      .withDottyCompat(scala.isDotty)

  val scalaJsTestInterface: Dep =
    Dep
      .Scala(scalaJs.scalaJsOrganization, "scalajs-test-interface", scalaJs.scalaJsVersion)
      .withDottyCompat(scala.isDotty)

  val scalaJsCompiler: Option[Dep.ScalaFullVersion] =
    if (scala.isDotty) None
    else Some(Dep.ScalaFullVersion(scalaJs.scalaJsOrganization, "scalajs-compiler", scalaJs.scalaJsVersion))

  val runtime      = Dep.ScalaJs("com.olvind", "scalablytyped-runtime", "2.3.0")
  val scalaJsDom   = Dep.ScalaJs("org.scala-js", "scalajs-dom", "1.1.0").withDottyCompat(scala.isDotty)
  val slinkyWeb    = Dep.ScalaJs("me.shadaj", "slinky-web", "0.6.6").withDottyCompat(scala.isDotty)
  val slinkyNative = Dep.ScalaJs("me.shadaj", "slinky-native", "0.6.6").withDottyCompat(scala.isDotty)
  val scalajsReact = Dep.ScalaJs("com.github.japgolly.scalajs-react", "core", "1.7.5").withDottyCompat(scala.isDotty)
}
