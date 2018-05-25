import play.core.PlayVersion
import play.sbt.PlayImport.ws
import sbt._

object AppDependencies {

  val compile = Seq(
    "com.typesafe.play" %% "play"      % PlayVersion.current,
    "uk.gov.hmrc"       %% "time"      % "3.1.0",
    "uk.gov.hmrc"       %% "http-core" % "0.7.0",
    ws
  )

  val test = Seq(
    "com.typesafe.play"      %% "play-test"      % PlayVersion.current % "test",
    "com.typesafe.play"      %% "play-specs2"    % PlayVersion.current % "test",
    "commons-codec"          % "commons-codec"   % "1.11"              % "test",
    "org.scalatest"          %% "scalatest"      % "3.0.5"             % "test",
    "org.scalacheck"         %% "scalacheck"     % "1.14.0"            % "test",
    "org.pegdown"            % "pegdown"         % "1.5.0"             % "test",
    "com.github.tomakehurst" % "wiremock"        % "1.52"              % "test",
    "ch.qos.logback"         % "logback-core"    % "1.1.7"             % "test",
    "ch.qos.logback"         % "logback-classic" % "1.1.7"             % "test",
    "org.webbitserver"       % "webbit"          % "0.4.15"            % "test"
  )

}
