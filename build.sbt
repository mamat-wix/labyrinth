name := "asciii"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies += "org.specs2" %% "specs2-core" % "4.8.2" % "test"

scalacOptions in Test ++= Seq("-Yrangepos")