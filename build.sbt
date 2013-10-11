import android.Keys._

android.Plugin.androidBuild

name := "keepassdroid"

packageName in Android := "com.keepass.dev"

libraryDependencies += "junit" % "junit" % "4.11" % "test"

debugIncludesTests in Android := false

// a necessity for building embedded in keepshare
libraryProject in Android := false
