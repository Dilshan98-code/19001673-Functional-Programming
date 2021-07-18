import scala.io.StdIn.readInt

object Q4 extends App{
  def getEven(start:Int,end:Int): Unit ={
    if(start<end){
    }
    if(start% 2 == 0){
      getEven(end,start-2)
    }
    else {
      getEven(end,start-1)
    }
    if(end%2==0){
      print(end+ " ")
    }
  }
  def getOdd(start:Int,end:Int): Unit ={
    if(end%2 ==1){
      getOdd(start,end-2)
    }
    else {
      getOdd(start,end-1)
    }
    if(end%2 ==1){
      print(end+ " ")
    }
  }
  print("Enter the Start number:")
  val start: Int = readInt()

  print("Enter the End number:")
  val end: Int = readInt()

  println("Even numbers: ")
  getEven(start,end)

  println("Odd numbers: ")
  getOdd(start,end)
}
