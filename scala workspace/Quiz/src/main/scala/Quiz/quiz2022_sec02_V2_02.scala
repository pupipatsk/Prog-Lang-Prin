package Quiz

object quiz2022_sec02_V2_02 {

  def isFound(e:Any, lst:List[Any]):Boolean = {
    if (lst.isEmpty) false
    else if (lst.head == e) true
    else isFound(e, lst.tail)
  }

  def uniqLst(lst1:List[Any],lst2:List[Any]):List[Any] = {
    if (lst1.isEmpty) List()
    else if (isFound(lst1.head, lst2)) uniqLst(lst1.tail, lst2)
    else lst1.head :: uniqLst(lst1.tail, lst2)
  }

  def differenceFromBoth(l1:List[Any],l2:List[Any]):List[Any] = {
    val uniqL1 = uniqLst(l1, l2)
    val uniqL2 = uniqLst(l2, l1)
    uniqL1 ++ uniqL2
  }

  def main(args: Array[String]): Unit = {
    val l1 = List(5,1,2,4)
    val l2 = List(10,2,4,6,8)
    println(differenceFromBoth(List(),l2)) // List(10, 2, 4, 6, 8)
    println(differenceFromBoth(l1,List())) // List(5, 1, 2, 4)
    println(differenceFromBoth(l1,l2)) // List(5, 1, 10, 6, 8)
  }
}
