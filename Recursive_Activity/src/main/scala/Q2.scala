/*
Can you write a recursive function primeSeq(n) that prints all 	prime number which less than n?
For example prime(10) should print 2,3,5, and 7 on the terminal.
 */
import scala.annotation.tailrec
import scala.io.StdIn.readInt
import scala.util.control.Breaks._

object Q2 extends App {
  @tailrec
  def GCD(a: Int, b: Int): Int= b match {
    case 0 => a
    case b if b>a => GCD(b,a)
    case _ => GCD(b,a%b)
  }
  @tailrec
  def isPrime(a:Int, n: Int =2): Boolean = n match {
    case n if n==a => true
    case n if GCD(a,n) >1 => false
    case n => isPrime(a,n+1)
  }
  def primeSeq(a:Int, b:Int):Any={
    if(a<b) primeSeq(a+1,b)
    if(isPrime(a))  print(a + " ")
  }

  print("Enter the number:")
  var num: Int = readInt()

  primeSeq(2,num)

}
