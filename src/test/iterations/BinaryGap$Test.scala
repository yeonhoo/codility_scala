package lessons

class BinaryGap$Test extends UnitSpec {

  it should "return maximal sequence of consecutive zeros" in {
    BinaryGap.solution(15) should be (0)
    BinaryGap.solution(9) should be (2)
    BinaryGap.solution(529) should be (4)
    BinaryGap.solution(20) should be (1)

  }
}
