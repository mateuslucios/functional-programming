package example

/**
 * Created by mateus on 6/12/16.
 */
object TailRecSum {

  def sum(f: Int => Int, a: Int, b: Int) = {

    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, acc + f(a))
    }

    loop(a, 0)
  }

}

