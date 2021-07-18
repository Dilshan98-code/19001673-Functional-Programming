import scala.io.StdIn.readInt

object Q6 extends App{
def fibonacci(n:Int):Int={
  if(n<=1){
    return n
  }
   fibonacci(n-1)+fibonacci(n-2)

}
  print("Enter the number:")
  val num: Int = readInt()
  println(fibonacci(num))
}
