// Index No: 19001673
/*
Implement a case class Point(x,y) and create following methods:

1. add(+) should add two given points

2. move should move a point by a given distance dx and dy

3. distance should return the distance between two given points

4. invert should switch the x and y coordinates.
*/

import scala.math._

case class Point(x: Int,y: Int){
  def +(p:Point): Point = {
    Point((this.x+p.x),(this.y+p.y));
  }
  def move(dx:Int, dy:Int): Point ={
    Point((this.x+dx),(this.y+dy));
  }
  def distance(p:Point):Double = {
  sqrt(pow((this.x-p.x),2)+pow((this.y-p.y),2));
  }
  def invert(): Point ={
    Point(this.y,this.x);
  }
}

object Question extends App{
  var p1 = Point(1,2);// point 1
  var p2 = Point(2,4);// point 2

  //add
  var p3 = p1+p2;
  println(p3+" = "+p1+" + "+p2)

  //move
  println("Before move: "+p2);
  p2= p2.move(1,2);
  println("After move by distance(1,2): "+p2);

  //distance
  var dist = p3.distance(p1);
  println("Distance between p3 and p1: "+dist);

  //invert
  var p = Point(3,8);
  println("Before invert: "+p);
  var pInvert = p.invert();
  println("After invert: "+pInvert);
}