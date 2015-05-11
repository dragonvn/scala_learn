package controllers

import play.api._
import play.api.mvc._
import models.User

object Tutorial extends Controller{
	def testMethod = Action{implicit request =>
//		User.insertUser
		Ok("Method hit : "+User.deleteUser)
	}
	
}