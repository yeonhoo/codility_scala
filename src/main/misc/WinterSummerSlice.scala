package lessons

object WinterSummerSlice {

  def solution(t: Array[Int]): Int = {

    var position = 1
    var highestWinterTemp, highestTemp = t(0)

    t.zipWithIndex.foreach {
      case(temp, idx) => {
        if (temp <= highestWinterTemp) {
          position = idx + 1
          highestWinterTemp = highestTemp
        }
        else if (temp > highestTemp)
          highestTemp = temp
      }
    }
    position
  }

}
