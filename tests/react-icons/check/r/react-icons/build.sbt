organization := "org.scalablytyped"
name := "react-icons"
version := "2.2-1e8e50"
scalaVersion := "3.0.0-M2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.3.0",
  "org.scalablytyped" %%% "react" % "0.0-unknown-7017ec",
  "org.scalablytyped" %%% "react-icon-base" % "2.1-7106cc",
  "org.scalablytyped" %%% "std" % "0.0-unknown-578926")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
