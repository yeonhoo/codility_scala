package lessons

object FrogJmp {

  def solution(x: Int, y: Int, d: Int): Int = {

    math.ceil((y - x).toDouble / d.toDouble).toInt
  }
}
