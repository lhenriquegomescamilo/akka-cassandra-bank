ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.3"

resolvers += "Akka library repository".at("https://repo.akka.io/maven")
resolvers += "Sonatype OSS Releases".at("https://oss.sonatype.org/content/repositories/releases")

resolvers += "Akka snapshots".at("https://artifacts.akka.io/snapshots")
resolvers += "Akka releases".at("https://artifacts.akka.io/releases")


lazy val root = (project in file("."))
  .settings(
    name := "akka-cassandra-bank"
  )

lazy val akkaHttpVersion = "10.6.3"
lazy val akkaVersion     = "2.9.4"
lazy val circeVersion    = "0.14.1"


libraryDependencies ++=Seq(
  "com.typesafe.akka" %% "akka-http"                  % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-actor-typed"           % akkaVersion,
  "com.typesafe.akka" %% "akka-stream"                % akkaVersion,
  "com.typesafe.akka" %% "akka-persistence-typed"     % akkaVersion,
  "com.typesafe.akka" %% "akka-http-spray-json"       % akkaHttpVersion,
  "com.datastax.oss"  %  "java-driver-core"           % "4.13.0",
  "com.typesafe.akka" %% "akka-persistence-cassandra" % "1.2.1",
  "io.circe"          %% "circe-core"                 % circeVersion,
  "io.circe"          %% "circe-generic"              % circeVersion,
  "io.circe"          %% "circe-parser"               % circeVersion,
  "ch.qos.logback"    % "logback-classic"             % "1.2.10",

  // optional, if you want to add tests
  "com.typesafe.akka" %% "akka-http-testkit"          % akkaHttpVersion % Test,
  "com.typesafe.akka" %% "akka-actor-testkit-typed"   % akkaVersion     % Test,
  "org.scalatest"     %% "scalatest"                  % "3.2.9"         % Test
)