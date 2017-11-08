package lessons

object OddOccurrencesInArray {

  def solution(a: Array[Int]): Int = {

    var res = 0

    a.foreach(e => res = res ^ e)

    res
  }
}
