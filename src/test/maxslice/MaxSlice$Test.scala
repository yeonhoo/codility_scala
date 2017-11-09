package lessons

class MaxSlice$Test extends UnitSpec {

  it should "return a " in {

    val arr = Array(-3,-4,-5,100)
    MaxSlice.solution(arr) should be(95)

  }
}

