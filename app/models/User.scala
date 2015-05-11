package models 

//import com.novus.salat.dao._

import com.mongodb.casbah.MongoCollection
import com.mongodb.{DBObject, BasicDBObject}
import org.bson.types.ObjectId
import models.MongoDBSetup
//import com.novus.salat.global._

case class User(user_name:String,
	high_score: Int,
	google_account: String,
	levlel: String)

object User{
  def insertUser: Unit ={
    val newUser = new User("duchv",123456,"duchv@mobilus.co.jp","super")
    MongoDBSetup.mongoDB("user").insert(new BasicDBObject("user_name", "MongoDB")
      .append("level", "database")
      .append("high_score", 1)
      .append("google_account","" ))
  }
  def getUser: MongoCollection#CursorType = {
    val query = new BasicDBObject("user_name", "MongoDB")
    return MongoDBSetup.mongoDB("user").find(query)
  }
  def deleteUser:Int = {
    val query = new BasicDBObject("user_name", "MongoDB")

    val result = MongoDBSetup.mongoDB("user").remove(query)
    return result.getN
  }

}


