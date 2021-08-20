//Index No: 19001673
class Rational_1(x: Int, y: Int){
  //Attributes
  def numer: Int =x // numerator
  def denom: Int = y //denominator

  //methods
  def neg: Rational_1 =
    new Rational_1(-this.numer, this.denom)

  override def toString: String = numer+ "/"+ denom
}
object Q1 extends App{
  val x = new Rational_1(3,4)
  print("x.neg : "+x.neg)
}
