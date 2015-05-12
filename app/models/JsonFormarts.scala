package models

import play.api.libs.json.Json
import play.api.data._
import play.api.data.Forms._
import models.User

/**
 * Created by DragonVN on 5/12/15.
 */
object JsonFormats{


  implicit val userFormat = Json.format[User]



}

