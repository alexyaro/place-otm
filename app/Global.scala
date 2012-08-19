import com.mongodb.casbah.Imports._
import play.api._
import models._
import se.radley.plugin.salat._

object Global extends GlobalSettings {

  override def onStart(app: Application) {
    if (OTMObject.count(DBObject(), Nil, Nil) == 0) {
      Logger.info("Loading Testdata")

      OTMObject.save(OTMObject(
        name = "Object A",
        desc = "",
        loc = MongoDBList(50.12347, 30.54323)
      ))

      OTMObject.save(OTMObject(
        name = "Object B",
        desc = "Alternative energy source",
        loc = MongoDBList(50.12341, 30.54321)
      ))
    }
  }

}
