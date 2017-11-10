package lessons

object Distinct {

  def solution(a: Array[Int]): Int = {
    val sorted = a.sortBy(x => x)
    //@TODO improve naming and refactor the code
    var comp = sorted(0)
    var diff = 1

    for (i <- 1 to sorted.length - 1) {
      if(sorted(i) != comp) {
        comp = sorted(i)
        diff += 1
      }
    }

    diff
  }

  //@TODO solution with Hash Table


}
