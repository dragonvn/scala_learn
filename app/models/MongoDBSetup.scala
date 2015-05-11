package models
import com.mongodb.casbah.Imports._

object MongoDBSetup {
	val mongoDB = MongoConnection()("test")
}