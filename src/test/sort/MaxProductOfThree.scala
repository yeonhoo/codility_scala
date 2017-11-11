package lessons

object MaxProductOfThree {
  def solution(a: Array[Int]): Int = {
    // take distict elements, then sort the array, take the last three elements and apply multiplication on them
    // i was wrong, repeated numbers shoul
    a.sorted.takeRight(3).fold(1){(result, i) => result * i}

  }
}
