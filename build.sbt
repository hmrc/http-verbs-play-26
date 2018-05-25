import sbt.Keys._
import sbt._
import uk.gov.hmrc.versioning.SbtGitVersioning

val appName = "http-verbs-play-26"

lazy val root = Project(appName, file("."))
  .enablePlugins(SbtAutoBuildPlugin, SbtGitVersioning)
  .settings(
    scalaVersion        := "2.11.12",
    libraryDependencies ++= AppDependencies.compile ++ AppDependencies.test,
    resolvers           += Resolver.jcenterRepo
  )
