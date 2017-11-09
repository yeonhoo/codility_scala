package lessons

object MaxSlice {

  def solution(a: Array[Int]): Int = {
    var max_ending, max_slice = -1000000

    for (el <- a) {
      max_ending = Math.max(el, max_ending + el)
      max_slice = Math.max(max_slice, max_ending)
    }
    max_slice
  }


}
