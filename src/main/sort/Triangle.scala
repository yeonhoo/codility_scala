package lessons

object Triangle {
  //@TODO refactor code
  def solution(a: Array[Int]): Int = {

    if (a.length < 3) 0 // test whether have more than 3 points to form at least one triangle

    val sorted = a.sortBy(x => x)

    var P = sorted(0)
    var Q = sorted(1)
    var R = sorted(2)
    var hasTriangle = 0

    for (i <- 0 to sorted.length - 3) {
      if (sorted(i) + sorted(i+1) > sorted(i+2)) hasTriangle = 1
    }

    hasTriangle
  }
}
