package lessons

object CyclicRotation {

  def solution(a: Array[Int], k: Int): Array[Int] = {

    val splited = a.splitAt(a.length - k)

    splited._2 ++ splited._1
  }
}
