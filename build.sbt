import android.Keys._

android.Plugin.androidBuild

name := "keepassdroid"

packageName in Android := "com.keepass.dev"

libraryDependencies += "junit" % "junit" % "4.11" % "test"
