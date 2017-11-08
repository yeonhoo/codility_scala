package lessons

object PermMissingElem {

  def solution(a: Array[Int]): Int = {

    (1 to a.length+1).sum - a.sum

  }
}
