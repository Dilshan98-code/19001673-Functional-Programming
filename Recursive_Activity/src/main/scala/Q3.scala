/*
Can you write a recursive function returns the addition of numbers from 1 to n?
For example sum(5) should print 15
 */

import scala.io.StdIn.readInt
object Q3 extends App{
  def Sum(n:Int):Int= n match {
    case n if n <= 1 => n
    case _ => n+ Sum(n-1)
  }
  print("Enter the number:")
  var num: Int = readInt().abs

  var result:Int = Sum(num)
  println("Sum of "+num+ " numbers: "+ result)
}
