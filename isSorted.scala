object ScalaStuffIsSorted {

  /** This is an example of a tail recursive isSorted function
  */
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean) : Boolean = {
    @annotation.tailrec
    def loop(theArray: Array[A]) : Boolean = {
      if (theArray.length == 1) true
      else if (!ordered(theArray(0), theArray(1))) false
      else loop(theArray.tail)
    }

    loop(as)
  }

  def main(args: Array[String]): Unit = {
    println(isSorted(Array(10, 12, 14 ,15), (x: Int, y: Int) => x < y))
  }
}