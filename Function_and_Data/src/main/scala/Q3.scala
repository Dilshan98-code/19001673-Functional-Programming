//Index No: 19001673
class Account(id:String,accNum:Int,bal:Double){
  //Attributes
  val nic:String= id
  val accNumber: Int = accNum
  var balance: Double = bal

  //Methods
  def withdraw(a:Double): Unit =
    this.balance=this.balance-a

  def deposit(a:Double): Unit =
    this.balance=this.balance+a

  def transfer(a:Account,amount:Double){
    this.withdraw(amount)
    a.deposit(amount)
  }
  def disPlay(): Unit = {
    println(s"[ NIC: $nic ]"+s"[ Account Number: $accNumber ]"+s"[ Balance: $balance ]")
  }
  override def toString: String =
    "["+nic+":"+accNumber +":"+ balance+"]"
}
object Q3 extends App {
  var acc1 = new Account("9879",1890,23150)
  var acc2 = new Account("9880",1891,0)

  println("Account States before:")
  acc1.disPlay()
  acc2.disPlay()

  acc1.transfer(acc2,2450)

  println("Account States after:")
  acc1.disPlay()
  acc2.disPlay()

}
