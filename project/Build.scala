import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "place-otm"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
//      "com.mongodb.casbah" %% "casbah" % "2.1.5.0",
//      "com.novus" %% "salat" % "0.0.8",
      "se.radley" %% "play-plugins-salat" % "1.0.8"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here
      routesImport += "se.radley.plugin.salat.Binders._",
      templatesImport += "org.bson.types.ObjectId"
    )

}
