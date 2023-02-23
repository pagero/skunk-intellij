name         := "skunk-intellij"
organization := "com.pagero"
version      := "0.1.0"

scalaVersion := "2.13.10"

Global / intellijAttachSources := true
ThisBuild / intellijBuild      := "2022.3"
ThisBuild / versionScheme      := Some("early-semver")

enablePlugins(SbtIdeaPlugin)
intellijPlugins += "org.intellij.scala".toPlugin

import ReleaseTransformations._

releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,              // : ReleaseStep
  inquireVersions,                        // : ReleaseStep
  runClean,                               // : ReleaseStep
  runTest,                                // : ReleaseStep
  setReleaseVersion,                      // : ReleaseStep
  commitReleaseVersion,                   // : ReleaseStep, performs the initial git checks
  tagRelease,                             // : ReleaseStep
//  publishArtifacts,                       // : ReleaseStep, checks whether `publishTo` is properly set up
  setNextVersion,                         // : ReleaseStep
  commitNextVersion,                      // : ReleaseStep
  pushChanges                             // : ReleaseStep, also checks that an upstream branch is properly configured
)
