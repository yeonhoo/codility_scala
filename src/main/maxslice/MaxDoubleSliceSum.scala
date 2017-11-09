package lessons

object MaxDoubleSliceSum {

  def solution(a: Array[Int]): Int = {

    /**
      * we can disregard a[1] and a[last] {last = a.length - 1}element because there are not part of double slice
      * as stated in problem spec
      * k1[i] being maximum contiguous sum starting from a[1] to a[last-1]
      * k2[i] being maximum contiguous sum starting from a[last-1] to a[1]
      * The maximum double slice sum is k1[i-1] + k2[i+1] with i from 1 to last-1
      *
      */

    val n = a.length
    val k1 = Array.fill(n) {0}
    val k2 = Array.fill(n) {0}
    var max = 0

    for (i <- 1 to n-2){
      k1(i) = Math.max(k1(i - 1) + a(i), 0)
      //println(s"k1(${i}) : ${k1(i)}")
    }

    for (i <- n-2 to 1 by -1) {
      println(s"i : ${i}")

      k2(i) = Math.max(k2(i + 1) + a(i), 0)
      //println(s"k2(${i}) : ${k2(i)}")
    }

    for (i <- 1 to n-2) {
      max = Math.max(k1(i-1)+k2(i+1), max)
      //println(s"k2(${i}) : ${k2(i)}")
    }

    max
  }
}
