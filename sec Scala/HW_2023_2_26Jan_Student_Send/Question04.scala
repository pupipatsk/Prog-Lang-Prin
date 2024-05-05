package HW

import scala.collection.immutable

object Question04 {

  def reverse(l:List[Any]): List[Any] = {
    if (l.isEmpty) List()
    else reverse(l.tail) ++ List(l.head)
  }

  def palindrome(l :List[Any]): Boolean ={
    l == reverse(l)
  }

  def main(args: Array[String]): Unit = {
    println(palindrome(List(1,2,2,1)))
  }

}
