package lessons

object Distinct {

  // this is naive approach, simplest one that came to mind in first place
  def solution(a: Array[Int]): Int = {

    var diff = 0

    if (a.length > 0) {
      val sorted = a.sortBy(x => x)
      //@TODO improve naming and refactor the code
      var comp = sorted(0)
      diff += 1

      for (i <- 1 to sorted.length - 1) {
        if(sorted(i) != comp) {
          comp = sorted(i)
          diff += 1
        }
      }
    }
    diff
  }
  //@TODO use distinct function
  //@TODO solution with recursion
  //@TODO solution with Hash Table


}
