
import com.sun.org.apache.xpath.internal.operations.NotEquals

import scala.io.StdIn._
import scala.reflect._

object seatReservation extends App {
  //function to reserve the seats
  def reserveSeat(num: Int, arr : Array[Array[Int]]): Array[Array[Int]] ={
    if(num <=10){
      if(arr(0)(num-1) != 0)
        {
          arr(0)(num-1) = 0
          println("Reservation successful")
        }
      else{
        println("The seat has been already reserved... Try Another")
      }
    }
    else{
      if(arr(1)(num-11) != 0)
      {
        arr(1)(num-11) = 0
        println("Reservation successful")
      }
      else{
        println("The seat has been already reserved... Try Another")
      }
    }
    return arr

  }
  //function to remove the seat reservations
  def removerReservation(num: Int, arr : Array[Array[Int]]): Array[Array[Int]] = {
    if(num <=10){
      if(arr(0)(num-1) == 0)
      {
        arr(0)(num-1) = num
        println("Seat no: "+ num+ " is available now")
      }
      else{
        println("The seat has been already available...")
      }
    }
    else{
      if(arr(1)(num-11) == 0)
      {
        arr(1)(num-11) = num
        println("Seat no: "+ num+ " is available now")
      }
      else{
        println("The seat has been already available...")
      }
    }
    return arr
  }
  //display seat availability
  def displayRows(seat : Array[Array[Int]]): Unit = {

    for (i <- 0 to 1) {
      print("Row: "+(i+1)+": [ ")
      for (j <- 0 to 9) {
        print(" "+seat(i)(j))
      }
      print(" ]")
      println()
    }
  }
// seat array
  var seatArr = Array.ofDim[Int](2,10)
  // loop variables
  var i = 0
  var j = 0

  var seatNo: Int = 0
  var k = 0
  for(i <- 0 to 1){

    for(j <- 0 to 9){
      seatArr(i)(j) = k+1
      k = k+1

    }
  }

  var str1 : Char = 'Y'
  print("Do you want to make a reservation or remove reservation ? (m/r)")
  str1 = readChar()
  while (str1 == 'm' || str1 == 'y') {
    displayRows(seatArr)
    print("Enter seat no to reserve:")
    seatNo = readInt()
    seatArr = reserveSeat(seatNo,seatArr)
    print("Do you want to make another reservation? (y/n)")
    str1 = readChar()
  }
  if(str1 != 'r'){
    print("Do you want to remove the reservation? (y/n)")
    str1 = readChar()
  }
  while(str1 == 'r' || str1 == 'y'){
    print("Enter your seat no:")
    seatNo = readInt()
    seatArr = removerReservation(seatNo, seatArr)
    displayRows(seatArr)
    print("Do you want to remove another reservation? (y/n)")
    str1 = readChar()

  }

  println("Have a good day!")

}



