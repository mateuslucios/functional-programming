package recfun

object Main {
  def main(args: Array[String]) {
    //    println("Pascal's Triangle")
    //    for (row <- 0 to 10) {
    //      for (col <- 0 to row)
    //        print(pascal(col, row) + " ")
    //      println()
    //    }

    // println(balance("()".toList))
    // println(balance(")(".toList))
    // println(balance(":-)".toList))

    println(countChange(4, List(1, 2)))
    println(countChange(5, List(1, 2, 3)))
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {

    def factorial(n: Int): Int = if (n == 0) 1 else n * factorial(n - 1)

    factorial(r) / (factorial(c) * factorial(r - c))
  }


  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def loop(chars: List[Char], brackets: List[Char]): Boolean = {

      if (chars.isEmpty) {
        brackets.isEmpty
      } else if (chars.head == '(') {
        loop(chars.tail, brackets :+ chars.head)
      } else if (chars.head == ')' && brackets.isEmpty) {
        false
      } else if (chars.head == ')' && brackets.head == '(') {
        loop(chars.tail, brackets.tail)
      } else {
        loop(chars.tail, brackets)
      }

    }

    loop(chars, List())

  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {

    def loop(money: Int, coins: List[Int]): Int = {

      if (money < 0) 0
      else if (money == 0) 1
      else if (coins.isEmpty) 0
      else {
        loop(money - coins.head, coins) + loop(money, coins.tail)
      }
    }

    loop(money, coins)
  }
}
