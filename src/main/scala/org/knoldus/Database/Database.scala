package org.knoldus.Database
trait Database[User] {
  def CreateUser(userDetails: User): Any

  def UpdateUser(id: Int, name: String): Any

  def DeleteUser(id: Int): Any
}
