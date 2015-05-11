name := """/Users/AnhLH/first-scala"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)

libraryDependencies ++= Seq(
  "com.github.ironfish" %% "akka-persistence-mongo-casbah"  % "0.7.5" % "compile")

