package exercises
/*
Given an array of integers, return a new array with each value doubled.
For example:
[1, 2, 3] --> [2, 4, 6]
1= integer
 */
object LostWithoutMap extends App{

  def maps(xs: List[Int]): List[Int] = {

    //adding yield to for loop will turn it into an expression= allows you to give back a value
    for (integer <- xs ) yield {
      integer*2
    }
  }

  println(maps(List(1,2,3,4,5,6)))

}
