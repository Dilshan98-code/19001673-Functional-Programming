import scala.annotation.tailrec
import scala.io.StdIn.readInt
import scala.util.control.Breaks._

object Q2 extends App {
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
  def primeSeq(num:Int): Unit ={
    for(i <- 2 to num){
      if(isPrime(num,2)){
        print(i + " ")
      }
      else{
        println("Number is not prime")
        break
      }
    }
  }
  print("Enter the number:")
  val num: Int = readInt()

  primeSeq(num)

}
