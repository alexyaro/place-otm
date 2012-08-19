package controllers

import play.api._
import play.api.mvc._
import models._
import se.radley.plugin.salat._
import com.mongodb.casbah.Imports._
import com.novus.salat._

object Application extends Controller {

  def list() = Action {
    val objects = OTMObject.findAll
    Ok(views.html.list(objects))
  }

  def viewotm(id: ObjectId) = Action {
    OTMObject.findOneById(id).map( otm =>
      Ok(views.html.otm(otm))
    ).getOrElse(NotFound)
  }

  /* TODO implement -> test
  def create(nameObject: String, description: String, location: String) = Action {
    val obj = OTMObject(
      name = nameObject,
      desc = description,
      loc = location
    )
    OTMObject.save(obj)
    Ok(views.html.present_object(obj))
  }*/

}
