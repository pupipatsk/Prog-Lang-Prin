package Lecture01_CommonFeatures

object LoopOnList {
  def main(args: Array[String]): Unit = {
    var mylist = List(1,3,5,7)
    for(m <- mylist) {
      println(m)
    }
  }
}
