import play.core.PlayVersion
import play.sbt.PlayImport.ws
import sbt._

object AppDependencies {

  val compile = Seq(
    "com.typesafe.play" %% "play"      % "2.6.21",
    "uk.gov.hmrc"       %% "http-core" % "1.3.0",
    ws
  )

  val test = Seq(
    "com.typesafe.play"      %% "play-test"      % "2.6.21" % Test,
    "com.typesafe.play"      %% "play-specs2"    % "2.6.21" % Test,
    "commons-codec"          % "commons-codec"   % "1.12"              % Test,
    "org.scalatest"          %% "scalatest"      % "3.0.5"             % Test,
    "org.scalacheck"         %% "scalacheck"     % "1.14.0"            % Test,
    "org.pegdown"            % "pegdown"         % "1.6.0"             % Test,
    "com.github.tomakehurst" % "wiremock"        % "1.58"              % Test,
    "ch.qos.logback"         % "logback-core"    % "1.1.11"             % Test,
    "ch.qos.logback"         % "logback-classic" % "1.1.11"             % Test,
    "org.webbitserver"       % "webbit"          % "0.4.15"            % Test
  )

}
