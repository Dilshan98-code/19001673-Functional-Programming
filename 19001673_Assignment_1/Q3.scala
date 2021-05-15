//Index No: 19001673
//Assigment 1: Q3

//3. Suppose the cover price of a book is Rs. 24.95, but bookstores get a 40% discount.
//Shipping costs Rs. 3 for the first 50 copy and 75 cents for each additional copy.
//What is the total wholesale cost for 60 copies?

object Q3 extends App {
  def wholeCost(NoOfBooks: Int)
  {
    val cost1 = 24.95*0.6*NoOfBooks
    var totCost = 0.0
    if(NoOfBooks > 50)
      {
        totCost = cost1+ 150 + 0.75f*(NoOfBooks-50)
      }
    else {
        totCost = cost1 + 3*NoOfBooks

    }
    println("Total wholesale cost: "+ totCost)
  }
wholeCost(60)
}


