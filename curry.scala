object ScalaStuffCurry {

  def curry[A,B,C](f: (A, B) => C): A => B => C =
    (a: A) => (b: B) => f(a, b)

  def main(args: Array[String]): Unit = {
    val result = curry((x: Int, y: Int) => x + y)

    println(result)
  }
}