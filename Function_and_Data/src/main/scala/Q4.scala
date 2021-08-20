//Index No: 19001673
class BankAccount(id:String,accNum:Int,bal:Double){
  //Attributes
  val nic:String= id
  val accNumber: Int = accNum
  var balance: Double = bal

  //Methods
  def withdraw(a:Double): Unit = this.balance=this.balance-a

  def deposit(a:Double): Unit = this.balance=this.balance+a

  def transfer(acc:BankAccount,amount:Double){
    this.withdraw(amount)
    acc.deposit(amount)
  }
  def calcInterest():Unit = {
    if(this.balance > 0){this.balance *=1.05}
    if(this.balance<0){this.balance *= 1.1}
  }

  def disPlay(): Unit = {
    println(s"[ NIC: $nic ]"+s"[ BankAccount Number: $accNumber ]"+s"[ Balance: $balance ]")
  }
  override def toString: String =
    "["+nic+":"+accNumber +":"+ balance+"]"
}
object Q4 extends App {
  val bank: List[BankAccount]=List(
  new BankAccount("9879",1890,20000),
  new BankAccount("9880",1891,-15000),
  new BankAccount("9881",1891,50000)
  )

  //List of Accounts with negative balances
  var overdraftAccounts: List[BankAccount] =bank.filter(Acc=>Acc.balance < 0)
  println(s"Accounts with overdraft: $overdraftAccounts")
  println()

  //sum of all account balances
  var getBalance: BankAccount => Double = (acc: BankAccount)=> acc.balance
  //  var accountBalanceSum = bank.map(getBalance).sum
  var accountBalanceSum: Double = bank.map(getBalance).reduce((b1, b2)=> b1+b2)
  println(s"Bank accounts balance: $accountBalanceSum")
  println()

  //calculating the interest
  for(acc <- bank){
    println(s"Current balance: ${acc.balance}")
    acc.calcInterest()
    println(s"New balance(+interest) : ${acc.balance}")
    println()
  }
}
