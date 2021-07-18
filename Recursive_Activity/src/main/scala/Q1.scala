import scala.annotation.tailrec
import scala.io.StdIn.readInt

object Q1 extends App{
  @tailrec
  def isPrime(n:Int, i:Int):Boolean={
    if(n <= 2){
      return if(n==2) true else false
    }
    if(n % i == 0){
      return false
    }
    if(i*i > n){
      return true
    }
    isPrime(n,i+1)
  }
  print("Enter the prime number:")
  val num: Int = readInt()

  var result:Boolean =  isPrime(num,2)
  println(result)

}

