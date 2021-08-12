package org.knoldus.START
import org.knoldus.USERS.USERS
import org.knoldus.Database.Database
import org.knoldus.bootstarp.Main

object Run extends App {

  val AllDATA: Database[USERS] = new Main
  AllDATA.CreateUser(USERS(1, "Tom"))
  AllDATA.CreateUser(USERS(2, "Jerry"))
  AllDATA.CreateUser(USERS(3, "Harry"))
  AllDATA.UpdateUser(2, "Jerry")
  AllDATA.DeleteUser(2)
}