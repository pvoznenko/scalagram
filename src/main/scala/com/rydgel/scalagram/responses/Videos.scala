package com.rydgel.scalagram.responses

import play.api.libs.json.Json

case class Videos(low_resolution: Video, standard_resolution: Video) extends InstagramData {
  lazy val lowResolution = low_resolution
  lazy val standardResolution = standard_resolution
}
object Videos {
  implicit val VideosReads = Json.reads[Videos]
  implicit val VideosWrites = Json.writes[Videos]
}
