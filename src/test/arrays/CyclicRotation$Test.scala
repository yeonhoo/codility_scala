package lessons

class CyclicRotation$Test extends UnitSpec {

  it should "return " in {
    val arr = Array(3, 8, 9, 7, 6)
    CyclicRotation.solution(arr, 2) should be(Array(7, 6, 3, 8, 9))
  }
}
