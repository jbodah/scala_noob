object Anonymous {
  // Successor
  (x: Int) => x + 1

  // ^ short-hand for
  new Function1[Int, Int] {
    def appl(x: Int): Int = x + 1
  }

  (x: Int, y: Int) => "(" + x + ", " + y + ")"

  () => { System.getProperty("user.dir") }

  Int => Int
  (Int, Int) => String
  () => String

  Function1[Int, Int]
  Function2[Int, Int, String]
  Function0[String]
}
