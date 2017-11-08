package lessons

class FileSizeGroup$Test extends UnitSpec {
  it should "return a " in {
    val files = "my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b" +
      "\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b"

    FileSizeGroup.solution(files) should be("music 1011b\nimage 0b\nmovie 10200b\nother 105b")
  }
}
