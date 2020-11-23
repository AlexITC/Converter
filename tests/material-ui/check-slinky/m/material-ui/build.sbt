organization := "org.scalablytyped"
name := "material-ui"
version := "0.0-unknown-f2005a"
scalaVersion := "3.0.0-M2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.3.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6" withDottyCompat scalaVersion.value,
  "org.scalablytyped" %%% "react" % "0.0-unknown-99a53c",
  "org.scalablytyped" %%% "std" % "0.0-unknown-27dbbd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
