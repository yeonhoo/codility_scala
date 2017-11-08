package lessons

class TapeEquilibrium$Test extends UnitSpec {
  it should "return a " in {

    val tapes = Array(3,1,2,4,3)
    TapeEquilibrium.solution(tapes) should be(1)
  }
}
