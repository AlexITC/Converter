organization := "org.scalablytyped"
name := "serve-static"
version := "0.0-unknown-d621ad"
scalaVersion := "3.0.0-M2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.3.0",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.0-unknown-5afd11",
  "org.scalablytyped" %%% "mime" % "2.0-7d22d6",
  "org.scalablytyped" %%% "std" % "0.0-unknown-6f1832")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
