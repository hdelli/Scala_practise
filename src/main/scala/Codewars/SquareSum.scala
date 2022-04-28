package Codewars
/*Complete the square sum function so that it squares each
number passed into it and then sums the results together.
For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
 */
object SquareSum extends App{

  def squareSum(xs: List[Int]): Int = {

    var sum = 0;
    if (xs.isEmpty) 0
    else {
    for (n <- xs) yield {
      if (n > 0) sum += n*n
    }
    }
    sum
  }

println(squareSum(List(1,2)))
}
