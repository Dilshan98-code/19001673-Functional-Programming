//Index No: 19001673
//Assigment 1: Q2

//2.The volume of a sphere with radius r is 4/3 Pi r3. What is the volume of a sphere with radius 5?

import scala.math._
object Q2 extends App {
  def findVol(rad :Double)=4f/3*Pi*pow(rad,3)
  println("Radius of the sphere: 5")
  println("Volume of the sphere: "+ findVol(5))

}
