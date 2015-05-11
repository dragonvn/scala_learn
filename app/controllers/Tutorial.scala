package controllers

import play.api._
import play.api.mvc._

object Tutorial extends Controller{
	def testMethod = Action{implicit request =>
		Ok("Method hit")
	}
	
}