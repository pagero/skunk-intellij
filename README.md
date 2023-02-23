# skunk-intellij
Support for skunk sql interpolator macro in IntelliJ IDEA.

This makes IntelliJ type inference working for `sql"""..."""` interpolated strings.

This plugin is included with zkunk `2.0.12` and above


## Steps to build a new version
1. Commit and merge your changes
2. Do `sbt release` on master
3. [Create a release](https://github.com/pagero/skunk-intellij/releases/new) on Github using the latest tag 
   - Attach the `skunk-intellij.jar` binary located at `target/plugin/skunk-intellij/lib/skunk-intellij.jar`
4. Update the version in the URL for `intellij-compat.json`

## Manual Installation 
1. Download the [latest version](https://github.com/pagero/skunk-intellij/releases/latest)
2. Add skunk-intellij.jar as an extension in `File | Settings | Languages & Frameworks | Scala | Extensions`
