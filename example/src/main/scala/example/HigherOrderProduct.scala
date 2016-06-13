package example

/**
 * Created by mateus on 6/12/16.
 */
object HigherOrderProduct {

  //  def product(f: Int => Int)(a: Int, b: Int): Int = {
  //
  //    def loop(a: Int, acc: Int): Int = {
  //      if (a > b) acc
  //      else loop(a + 1, acc * f(a))
  //    }
  //
  //    loop(a, 1)
  //  }
  //
  //  def sum(f: Int => Int, a: Int, b: Int) = {
  //
  //    def loop(a: Int, acc: Int): Int = {
  //      if (a > b) acc
  //      else loop(a + 1, acc + f(a))
  //    }
  //
  //    loop(a, 0)
  //  }

  def mapReduce(base: Int, combine: (Int, Int) => Int, f: Int => Int)(a: Int, b: Int) = {

    def loop(acc: Int, a: Int): Int = {
      if (a > b) acc
      else loop(combine(acc, f(a)), a + 1)
    }

    loop(base, a)

  }

  def product(f: Int => Int)(a: Int, b: Int): Int = {

    def _product(x: Int, y: Int): Int = x * y

    mapReduce(1, _product, f)(a, b)
  }

  def sum(f: Int => Int)(a: Int, b: Int): Int = {

    def _sum(x: Int, y: Int): Int = x + y

    mapReduce(0, _sum, f)(a, b)
  }

  def factorial(n: Int) = product(x => x)(1, n)


}
