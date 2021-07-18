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
    case b if b==0 => a
    case b if b>a => GCD(b,a)
    case _ => GCD(b,a%b)
  }
  @tailrec
  def isPrime(a:Int, n: Int =2): Boolean = n match {
    case n if n==a => true
    case n if GCD(a,n) >1 => false
    case _ => isPrime(a,n+1)
  }
  // print all the prime numbers less than num
  def primeSeq(a:Int, b:Int):Any={
    if(a<b) primeSeq(a+1,b)
    if(isPrime(a))  print(a + " ") // if a is prime? print a : exit
  }

  print("Enter the number:")
  var num: Int = readInt().abs

  primeSeq(2,num)

}
