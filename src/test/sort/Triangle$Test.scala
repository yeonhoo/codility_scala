package lessons

class Triangle$Test extends UnitSpec {
  it should "return a " in {
    val arr1 = Array(10 ,2, 5, 1, 8, 20)
    Triangle.solution(arr1) should be(1)

    val arr2 = Array(10, 50, 5, 1)
    Triangle.solution(arr2) should be(0)
  }

}
