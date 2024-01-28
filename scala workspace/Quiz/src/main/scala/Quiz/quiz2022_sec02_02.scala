package Quiz

object quiz2022_sec02_02 {

  def isFound(e:Any, lst:List[Any]):Boolean = {
    if (lst.isEmpty) false
    else if (lst.head == e) true
    else isFound(e, lst.tail)
  }

  def sameElemLst(l1:List[Any], l2:List[Any], accL:List[Any]):List[Any] = {
    if (l1.isEmpty) accL
    else if (isFound(l1.head, l2)) l1.head :: sameElemLst(l1.tail,l2,accL)
    else sameElemLst(l1.tail,l2,accL)
  }

  def moreThanHalf(l1:List[Any],l2:List[Any]):Boolean = {
    if (l1.isEmpty && l2.isEmpty) {
      false
    } else {
      val LstOfSameElem = sameElemLst(l1, l2, List())
      LstOfSameElem.length >= l1.length / 2.0
    }
  }

  def main(args: Array[String]): Unit = {
    val l00 = List()
    val l01 = List()
    val l1 = List(1,4,3,2,7,8)
    val l2 = List(2,9,7,1,6,10)
    val l3 = List(12,11,6,5,3,2)
    val l4 = List("1","2","3","4","5")
    val l5 = List("9","7","5","3","1")
    val l6 = List("2","4","6","8","10")
    println(moreThanHalf(l00,l01)) //false
    println(moreThanHalf(l1,l01)) //false
    println(moreThanHalf(l1,l2)) //true
    println(moreThanHalf(l1,l3)) //false
    println(moreThanHalf(l4,l5)) //true
    println(moreThanHalf(l4,l6)) //false
  }
}
