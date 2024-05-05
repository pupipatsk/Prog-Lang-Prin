package HW

object Question01 {
  def insertAtPosition(x: Any, pos: Int, l:List[Any]): List[Any] ={
    if (pos == 0) x :: l
    else l.head :: insertAtPosition(x,pos-1,l.tail)
  }

  def main(args: Array[String]): Unit = {
    println(insertAtPosition(3,2,List(1,1,2,3,4)))
  }
}
