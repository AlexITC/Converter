organization := "org.scalablytyped"
name := "react-select"
version := "0.0-unknown-fb2c9c"
scalaVersion := "3.0.0-M2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.7.5" withDottyCompat scalaVersion.value,
  "com.olvind" %%% "scalablytyped-runtime" % "2.3.0",
  "org.scalablytyped" %%% "react" % "16.9.2-a7dc86",
  "org.scalablytyped" %%% "std" % "0.0-unknown-8e5572")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
