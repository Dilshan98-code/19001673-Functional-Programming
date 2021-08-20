//Index No: 19001673
class Rational_2(x: Int, y: Int){
  //Attributes
  def numer: Int =x // numerator
  def denom: Int = y //denominator

  //methods
  def +(r: Rational_2): Rational_2 =
    new Rational_2((numer*r.denom)+ r.numer*denom, denom*r.denom)

  //method negation
  def neg: Rational_2 =
    new Rational_2(-this.numer, this.denom)
  //method subtract
  def -(r:Rational_2): Rational_2 =
    this+r.neg

  override def toString: String = numer+ "/"+ denom
}
object Q2 extends App {
  val x = new Rational_2(3,4)
  val y = new Rational_2(5,8)
  val z = new Rational_2(2,7)

  print(x-y-z)
}

