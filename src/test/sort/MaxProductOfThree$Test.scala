package lessons

class MaxProductOfThree$Test extends UnitSpec {
  it should "return a " in {

    val arr1 = Array(-3,1,2,-2,5,6)
    MaxProductOfThree.solution(arr1) should be(60)

    val arr2 = Array(-5, 5, -5, 4)
    MaxProductOfThree.solution(arr2) should be(125)
  }
}
