/*
Can you write a recursive function to determine even and odd numbers?
 */
import scala.io.StdIn.readInt

object Q4 extends App{
  def isEven(a:Int): Boolean = a match {
    case 0 => true
    case _ => isOdd(a-1)
  }
  def isOdd(a: Int): Boolean = !isEven(a)
  print("Enter the number:")
  var num: Int = readInt()

  if(isEven(num)){
    println("Number is Even!")
  }
  else {
    println("Number is Odd!")
  }
}
