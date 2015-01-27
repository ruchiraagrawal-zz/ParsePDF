name := """pdfParser"""

version := "1.0"

scalaVersion := "2.11.1"

mainClass := Some("pdfMain")

resolvers += "releases" at "http://oss.sonatype.org/content/repositories/releases"

libraryDependencies ++= Seq(
"net.sourceforge.htmlcleaner" % "htmlcleaner" % "2.4",
"org.apache.commons" % "commons-lang3" % "3.0",
"net.liftweb" % "lift-json_2.11" % "2.6-M4",
"org.apache.tika" % "tika-parsers" % "1.6",
"org.apache.pdfbox"	% "pdfbox-app" %	"1.8.6",
"org.apache.httpcomponents" % "httpclient" % "4.3.5"
)