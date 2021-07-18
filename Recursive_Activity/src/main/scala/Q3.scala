import scala.io.StdIn.readInt
object Q3 extends App{
  def Sum(n:Int):Int={
    if(n <= 1){
      return n
    }
    n+ Sum(n-1)
  }
  print("Enter the number:")
  val num: Int = readInt()

  var result:Int = Sum(num)
  println("Sum of "+num+ " numbers: "+ result)
}
