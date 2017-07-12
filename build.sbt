import sbt._

name := "scaladoku"
version := "1.0"
scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
	"com.typesafe.akka" %% "akka-http-experimental" % "1.0",
	"org.scalatest" %% "scalatest" % "2.2.1" % "test"
)
