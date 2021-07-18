/*
Can you write a recursive function prime(n) that returns true for a prime number and false for the other?
For example prime(5) should return true and prime(8) should return false.
 */

import scala.annotation.tailrec
import scala.io.StdIn.readInt

object Q1 extends App{

  @tailrec
  def GCD(a: Int, b: Int): Int= b match {
    case b if b==0 => a
    case b if b>a => GCD(b,a)
    case _ => GCD(b,a%b)
  }
  //check weather the number is prime??
  @tailrec
  def isPrime(a:Int, n: Int =2): Boolean = n match {
    case n if n==a => true
    //GCD: a number that is divisible only by itself and 1
    case n if GCD(a,n) >1 => false // if GCD is greater than 1 --> the number is not prime
    case _ => isPrime(a,n+1)
  }

  print("Enter the number:")
  var num: Int = readInt().abs

  var result:Boolean =  isPrime(num)
  println(result)

}

