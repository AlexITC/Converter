organization := "org.scalablytyped"
name := "storybook__vue"
version := "3.3-11747e"
scalaVersion := "3.0.0-M2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.3.0",
  "org.scalablytyped" %%% "std" % "0.0-unknown-587783",
  "org.scalablytyped" %%% "vue" % "2.5.13-0d6588",
  "org.scalablytyped" %%% "webpack-env" % "1.13-b0a4c3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
