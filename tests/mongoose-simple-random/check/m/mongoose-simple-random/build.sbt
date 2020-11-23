organization := "org.scalablytyped"
name := "mongoose-simple-random"
version := "0.4-6988b4"
scalaVersion := "3.0.0-M2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.3.0",
  "org.scalablytyped" %%% "mongoose" % "0.0-unknown-f33596",
  "org.scalablytyped" %%% "node" % "0.0-unknown-fc8674",
  "org.scalablytyped" %%% "std" % "0.0-unknown-e3c686")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
