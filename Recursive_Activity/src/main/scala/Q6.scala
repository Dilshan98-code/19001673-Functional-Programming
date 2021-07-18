/*
The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, . . .
Each subsequent number is the sum of the previous two.
Write a recursive function print fist n Fibonacci numbers for given n.
 */
import scala.annotation.tailrec
import scala.io.StdIn.readInt

object Q6 extends App{

  def fibonacci(n:Int):Int= n match {
  case 0 => 0
  case n if n==1 => 1
  case _ => fibonacci(n-1)+ fibonacci(n-2)

}
  def fibonacciSeq(n:Int): Unit={
    if(n>0) fibonacciSeq(n-1)
    print(fibonacci(n)+ " ")
  }

  print("Enter the number:")
  val num: Int = readInt().abs
  fibonacciSeq(num)
}
