def p(x: Double, n : Int) : Double = {
  if (n > 0 && n % 2 == 0) {
    val y = p(x, (n / 2))
    y * y
  } else if (n > 0 && n % 2 != 0) {
    x * p(x, n - 1)
  } else if (n == 0) {
    1;
  } else {
    1 / p(x, -n)
  }
} 


def swapAdj(a: Array[Int]) = {
  for {
    i <- 0 until a.length
    val v = if (i == a.length - 1) a(i) else if (i % 2 == 0) a(i + 1) else a(i - 1)  
  } yield v 
}