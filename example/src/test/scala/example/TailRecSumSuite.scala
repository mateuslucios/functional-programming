package example

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
 * Created by mateus on 6/12/16.
 */
@RunWith(classOf[JUnitRunner])
class TailRecSumSuite extends FunSuite {

  import TailRecSum._

  test("sum of number in range 1 to 3"){

    assert(sum(x => x * x * x, 1, 3) == 36)

  }

}
