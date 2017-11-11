package lessons

class Distinct$Test extends UnitSpec {
  it should "return a " in {
    val arr = Array(2,1,1,2,3,1)
    Distinct.solution(arr) should be(3)

    val arr_empty = Array[Int]()
    Distinct.solution(arr_empty) should be(0)
  }

}
