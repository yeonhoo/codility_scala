package lessons

object TapeEquilibrium {

  def solution(tapes: Array[Int]): Int = {

    var min = Integer.MAX_VALUE
    for (n <- 0 until tapes.length - 1 ) {
      val splits = tapes.splitAt(n+1)
      //println(splits._1.toString)
      //println(splits._2.toString)
      val diff = (splits._1.sum - splits._2.sum).abs

      if (diff == 0) diff
      if (min > diff) min = diff
    }

    min
  }
}
