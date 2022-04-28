package Codewars

/*
Very simple, given an integer or a floating-point number, find its opposite.
Examples:
1: -1
14: -14
-34: 34
 */
object OppositeNum extends App {

  def opposite(number: Double): Double = {

    if (number > 0) -number
    else if (number == 0) number
    else if (number < 0) -number
    else number


  }

  println(opposite(0))
}
