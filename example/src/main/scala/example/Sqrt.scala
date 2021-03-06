package example

/**
 * Created by mateus on 6/12/16.
 */
object Sqrt {

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {

    val tolerance = 0.0001

    def isCloseEnough(x: Double, y: Double) =
      math.abs((x - y) / x) / x < tolerance

    def iterate(guess: Double): Double = {
      val next = f(guess)
      println(next)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }

    iterate(firstGuess)
  }

  def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2

  def sqrt(x: Double) = fixedPoint(averageDamp(x => x / (x / 2)))(1.0)

}
