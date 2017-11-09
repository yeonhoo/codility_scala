package lessons

object MaxProfit {

  def solution(a: Array[Int]): Int = {

    var maxProfit = 0
    var min = 200000

    for (day <- a) {
      min = Math.min(min, day)
      maxProfit = Math.max(maxProfit, day - min)
    }

    maxProfit
  }
}
