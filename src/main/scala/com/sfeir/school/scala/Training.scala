package com.sfeir.school.scala

/**
  * Sfeir School - Scala 100
  */
case class Training(topic: String, level: Int, planning: Seq[(Int, Location)]) {
  require(planning.nonEmpty, "planning must contains at least one element")

  val locations: Seq[Location] =
    // Could also be written in short notation: planning map (_._2)
    planning.map(plan => plan._2)

  lazy val name: String =
    s"$topic-$level"
}


sealed abstract class Location {
  def name: String
}

case class SfeirEntity(name: String) extends Location
case class Company(name: String, hasWifi: Boolean = true) extends Location
