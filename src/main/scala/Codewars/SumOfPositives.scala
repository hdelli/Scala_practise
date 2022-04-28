package Codewars

/*You get an array of numbers, return the sum of all of the positives ones.
Example [1,-4,7,12] => 1 + 7 + 12 = 20
Note: if there is nothing to sum, the sum is default to 0.
 */
object SumOfPositives extends App {

  def sumOfNum(num: Array[Int]): Int = {

    var sum = 0
    if (num.isEmpty) 0
    else {
      for (n <- num) yield {
        if (n > 0) sum += n
      }
    }
    sum
  }

  println(sumOfNum(Array(2, -3, 4)))
  //use array()

  //easier way to do this
  def positiveSum(arr: Array[Int]): Int = arr.filter(_ > 0).sum

}
