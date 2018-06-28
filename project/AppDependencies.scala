import play.core.PlayVersion
import play.sbt.PlayImport.ws
import sbt._

object AppDependencies {

  val compile = Seq(
    "com.typesafe.play" %% "play"      % PlayVersion.current,
    "uk.gov.hmrc"       %% "http-core" % "0.10.0",
    ws
  )

  val test = Seq(
    "com.typesafe.play"      %% "play-test"      % PlayVersion.current % Test,
    "com.typesafe.play"      %% "play-specs2"    % PlayVersion.current % Test,
    "commons-codec"          % "commons-codec"   % "1.11"              % Test,
    "org.scalatest"          %% "scalatest"      % "3.0.5"             % Test,
    "org.scalacheck"         %% "scalacheck"     % "1.14.0"            % Test,
    "org.pegdown"            % "pegdown"         % "1.5.0"             % Test,
    "com.github.tomakehurst" % "wiremock"        % "1.52"              % Test,
    "ch.qos.logback"         % "logback-core"    % "1.1.7"             % Test,
    "ch.qos.logback"         % "logback-classic" % "1.1.7"             % Test,
    "org.webbitserver"       % "webbit"          % "0.4.15"            % Test
  )

}
