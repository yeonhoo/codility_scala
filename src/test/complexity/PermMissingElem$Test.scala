package lessons

class PermMissingElem$Test extends UnitSpec {

  it should "return a " in {
    val arr = Array(1,2,3,4,6)
    PermMissingElem.solution(arr) should be(5)
  }
}
