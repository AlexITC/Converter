organization := "org.scalablytyped"
name := "react"
version := "0.0-unknown-bb0799"
scalaVersion := "3.0.0-M2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.3.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6" withDottyCompat scalaVersion.value,
  "org.scalablytyped" %%% "std" % "0.0-unknown-ba3932")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
