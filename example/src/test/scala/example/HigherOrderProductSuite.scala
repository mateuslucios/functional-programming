package example

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
 * Created by mateus on 6/12/16.
 */
@RunWith(classOf[JUnitRunner])
class HigherOrderProductSuite extends FunSuite {

  import HigherOrderProduct._

  test("products of a range") {
    assert(product(x => x * x * x)(1, 3) == 216)
  }

  test("products of a range 3, 4") {
    assert(product(x => x * x)(3, 4) == 144)
  }

  test("testing factorial of 0") {
    assert(factorial(0) == 1)
  }

  test("testing factorial of 3") {
    assert(factorial(3) == 6)
  }
}
