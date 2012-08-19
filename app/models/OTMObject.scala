package models

import play.api.Play.current
import com.novus.salat._
import com.novus.salat.dao._
import com.mongodb.casbah.Imports._
import se.radley.plugin.salat._
import mongoContext._
import com.mongodb.BasicDBList

/**
 * Created with IntelliJ IDEA.
 * User: Alexandr
 * Date: 8/19/12
 * Time: 9:00 PM
 * To change this template use File | Settings | File Templates.
 */
case class OTMObject (
  id: ObjectId = new ObjectId,
  name: String,
  desc: String,
  loc: BasicDBList
)

object OTMObject extends ModelCompanion[OTMObject, ObjectId] {
  val collection = mongoCollection("test")
  val dao = new SalatDAO[OTMObject, ObjectId](collection = collection) {}
}
