//Index No: 19001673
//Assigment 1: Q1
//1. The temperature is 35C; convert this temperature into Fahrenheit.
// ºF =ºC * 1.8000 + 32.00

object Q1 extends App {
  def convertTemp(temp :Double)= temp*1.8 + 32
    println("Temp in Celsius: 35C")
    println("Temp in Fahrenheit: "+ convertTemp(35))

}
