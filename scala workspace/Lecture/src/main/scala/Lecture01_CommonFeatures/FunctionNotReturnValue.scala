package Lecture01_CommonFeatures

object FunctionNotReturnValue {
  def f1(x:Int):Unit ={
    println(s"x is given = $x")
  }
  def main(args: Array[String]): Unit = {
    f1(3)
  }
}
