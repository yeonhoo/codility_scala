package lessons

class OddOccurrencesInArray$Test extends UnitSpec {

  it should "return a number which occur in odd times in array" in {

    val arr = Array(9,3,9,3,9,7,9)
    OddOccurrencesInArray.solution(arr) should be(7)
  }
}
