package lessons

object FileSizeGroup {

  def solution(s: String): String = {

    var music = 0
    var image = 0
    var movie = 0
    var other = 0

    val splitList = s.split("\n")
    splitList.foreach{ file =>
      val fileInfo = file.split(" ")

      val fileExtension = fileInfo(0).split("\\.").last
      val fileSize = fileInfo(1).substring(0, fileInfo(1).length-1).toInt

      fileExtension match {
        case "mp3" | "aac" | "flac" => music += fileSize
        case "jpg" | "bmp" | "gif" => image += fileSize
        case "mp4" | "avi" | "mkv" => movie += fileSize
        case _  => other += fileSize
      }
    }
    s"music ${music}b\nimage ${image}b\nmovie ${movie}b\nother ${other}b"

  }
}
