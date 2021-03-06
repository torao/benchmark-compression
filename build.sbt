organization := "at.hazm"

name := "benchmark-compression"

version := "0.1"

scalaVersion := "2.12.5"

resolvers ++= Seq(
  "bintray" at "http://dl.bintray.com/nitram509/jbrotli"
)

libraryDependencies ++= Seq(
  "org.apache.commons" % "commons-compress" % "1.16.1",
  "org.xerial.snappy" % "snappy-java" % "1.1.7.1",
  "com.github.luben" % "zstd-jni" % "1.3.3-4",
  "org.lz4" % "lz4-java" % "1.4.1",
  // in sbt, bjrotil needs platform-depend library manually
  // see http://dl.bintray.com/nitram509/jbrotli/org/meteogroup/jbrotli/jbrotli-native-win32-x86-amd64/0.5.0/
  "org.meteogroup.jbrotli" % "jbrotli" % "0.5.0",
  "org.meteogroup.jbrotli" % "jbrotli-native-win32-x86-amd64" % "0.5.0"
)
