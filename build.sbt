name := "My Project"

version := "1.0"

scalaVersion := "2.9.0-1"

// Include Assembly Commands
seq(sbtassembly.Plugin.assemblySettings: _*)

// Include Web Commands
seq(webSettings :_*)

// vim: sts=4 sw=4 ts=4 et ft=scala
