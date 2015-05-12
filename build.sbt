name := """/Users/AnhLH/first-scala"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

//library be used in play
libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)


// only for Play 2.3.x
libraryDependencies ++= Seq(
  "org.reactivemongo" %% "play2-reactivemongo" % "0.10.5.0.akka23"
)

