lazy val root = (project in file("."))
  .settings(
  // Project name (artifact name in Maven)
  name := "(java-cli-sb)",

  // orgnization name (e.g., the package name of the project)
  organization := "com.treasure-data",

  version := "1.0-SNAPSHOT",

  // project description
  description := "Treasure Data Project",

  // Do not append Scala versions to the generated artifacts
  crossPaths := false,

  // This forbids including Scala related libraries into the dependency
  autoScalaLibrary := false,

  // javacOptions in (Compile, compile) ++= Seq("-source", "1.8", "-target", "1.8", "-g:lines"),

  libraryDependencies ++= Seq(
    "org.springframework.boot" % "spring-boot-starter-web" % "2.4.2",
    "org.apache.tomcat.embed" % "tomcat-embed-jasper" % "9.0.46",
    "javax.servlet" % "javax.servlet-api" % "4.0.0",
    "javax.servlet.jsp" % "javax.servlet.jsp-api" % "2.3.3" % "provided",
    "javax.servlet" % "jstl" % "1.2"
   ),

  mainClass := Some("example.Main")
)
