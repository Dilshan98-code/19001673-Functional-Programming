/*
Can you write a recursive function to get the addition of all even numbers less than given n.
 */
import scala.io.StdIn.readInt

object Q5 extends App{
  def isEven(a:Int): Boolean = a match {
    case 0 => true
    case _ => isOdd(a-1)
  }
  def isOdd(a: Int): Boolean = !isEven(a)

  def evenAdd(n:Int):Int =n match {
    case n if n < 1 => 0
    case n if isEven(n) =>n-2 + evenAdd(n - 2)
    case n if !isEven(n) => (n - 1) + evenAdd(n - 2)
  }
  print("Enter the number:")
  var num: Int = readInt()
  println(evenAdd(num))

}