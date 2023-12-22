name         := "skunk-intellij"
organization := "com.pagero"
version      := "0.2"

scalaVersion := "2.13.12"

Global / intellijAttachSources := true
ThisBuild / intellijBuild      := "233.13135.103"
ThisBuild / versionScheme      := Some("early-semver")

enablePlugins(SbtIdeaPlugin)
intellijPlugins += "org.intellij.scala".toPlugin

import ReleaseTransformations.*

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
