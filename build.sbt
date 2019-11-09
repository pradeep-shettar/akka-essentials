name := "akka-essentials"

version := "0.1"

scalaVersion := "2.13.1"

val akkaVersion = "2.5.23"

libraryDependencies ++= Seq(
  //Dependency for akka with akka actor version.
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-test" % akkaVersion,
  "org.scalatest" %% "scalatest" % "3.0.8"
)