package lessons

object BinaryGap {

  def solution(N: Int): Int = {
    // positive lookbehind and positive lookahead are used to match 10+1 pattern
    val list = "(?<=1)0+(?=1)".r.findAllIn(N.toBinaryString).toList

    list.length match {
      case 0 => 0
      case _ => list.max.length
    }
  }
}
