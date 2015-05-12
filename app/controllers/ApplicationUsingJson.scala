package controllers

/**
 * Created by DragonVN on 5/12/15.
 */

import play.api._
import play.api.mvc._

import play.api.libs.json._
import play.api.libs.concurrent.Execution.Implicits.defaultContext

// Reactive Mongo imports
import reactivemongo.api._

// Reactive Mongo plugin, including the JSON-specialized collection
import play.modules.reactivemongo.MongoController
import play.modules.reactivemongo.json.collection.JSONCollection
import scala.concurrent.Future


object ApplicationUsingJson extends Controller with MongoController{
  def collection :JSONCollection = db.collection[JSONCollection]("user")

  import play.api.data.Form
  import models._
  import models.JsonFormats._

  def index = Action{Ok("i'm here")}

  def create = Action.async {
    val newuser = User("linhlt",555,"linhlt@mobilus.co.jp","QA")

    val futureResult = collection.insert(newuser)

    // when the insert is performed, send a OK 200 result
    futureResult.map(_=>Ok)
  }

}
