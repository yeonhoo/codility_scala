package lessons

class MaxDoubleSliceSum$Test extends UnitSpec {
  it should "return a " in {
    val arr = Array(3,2,6,-1,4,5,-1,2)
    MaxDoubleSliceSum.solution(arr) should be(17)
  }
}
