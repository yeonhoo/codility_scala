package lessons

class MaxProfit$Test extends UnitSpec {
  it should "return a " in {

    val arr1= Array(23171,21011,21123,21366,21013,21367)

    MaxProfit.solution(arr1) should be(356)
  }

}
