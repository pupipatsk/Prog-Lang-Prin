package HW

object Question05 {
  def E(l1:List[Int],l2:List[Int]):List[List[Int]] = {
    if(l1.length < l2.length) E(l1 ++ List(l2.head),l2.tail)
    else List(l1,l2)
  }
  def G(l1:List[Int], l2:List[Int]):List[Int] = {
    if(l1.isEmpty) l2
    else if(l2.isEmpty) l1
    else if(l1.head < l2.head) l1.head :: G(l1.tail,l2)
    else l2.head :: G(l1,l2.tail)
  }
  def mergesort(l: List[Int]):List[Int] = {
    if(l.length <= 1) l
    else {
      var a = E(List(), l)
      var b = mergesort(a.head)
      var c = mergesort(a.tail.head)
      G(b, c)
    }
  }

  def main(args:Array[String]): Unit = {
    println(mergesort(List(1,3,5,2,2,5,6,7,5,3)))
  }
}
