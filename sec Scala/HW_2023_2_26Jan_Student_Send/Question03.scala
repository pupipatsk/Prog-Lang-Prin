package HW

object Question03 {

  def isNotIn(elem:Any, lst:List[Any]):Boolean = {
    if (lst.isEmpty) true
    else if (elem == lst.head) false
    else isNotIn(elem, lst.tail)
  }

  def subList(l1: List[Any], l2:List[Any]): Boolean ={
    if (l1.isEmpty) true
    else if (isNotIn(l1.head,l2)) false
    else subList(l1.tail, l2)
  }

  def main(args: Array[String]): Unit = {
    println(subList(List(1,2,3), List(1,2,3,4)))
  }


}
