package lessons

class WinterSummerSlice$Test extends UnitSpec {

  it should "return a " in {
    val t1 = Array(5,-2,3,8,6)
    val t2 = Array(-5,-5,-5,-5,6,12)
    val t3 = Array(-5,-5,-5,-42,6,-8,4,-19,8)
    val t4 = Array(-5,-5,-5,-42,6,-3,4,-19,8)

    WinterSummerSlice.solution(t1) should be(3)
    WinterSummerSlice.solution(t2) should be(4)
    WinterSummerSlice.solution(t3) should be(8)
    WinterSummerSlice.solution(t4) should be(8)
  }
}
