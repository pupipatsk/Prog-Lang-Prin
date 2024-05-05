package HW

object Question02 {
  def insertInOrder(x: Int, l:List[Int]): List[Int] ={
    if (l.isEmpty) List()
    else if (l.head < x && x < l.tail.head) l.head :: x :: l.tail
    else l.head :: insertInOrder(x, l.tail)
  }

  def main(args: Array[String]): Unit = {
    println(insertInOrder(2,List(1,1,3,3,4)))
  }
}
