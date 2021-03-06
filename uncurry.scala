object ScalaStuffUncurry {

  def uncurry[A,B,C](f: A => B => C) : (A, B) => C =
    (a: A, b: B) => f(a)(b)

  def main(args: Array[String]): Unit = {
    uncurry((x: Int) => (y: Int) => (x: Int))
  }
}