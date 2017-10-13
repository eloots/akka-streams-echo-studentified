
import sbt._

lazy val akka_streams_demo = (project in file("."))
  .aggregate(
    common,
    demo_stage
  )
  .settings(CommonSettings.commonSettings: _*)
lazy val common = project.settings(CommonSettings.commonSettings: _*)

lazy val demo_stage = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")
       