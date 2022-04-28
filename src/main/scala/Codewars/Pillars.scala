package Codewars

/*
There are pillars near the road. The distance between the pillars is
the same and the width of the pillars is the same. Your function accepts three arguments:

  number of pillars (≥ 1);
  distance between pillars (10 - 30 meters);
  width of the pillar (10 - 50 centimeters).
  Calculate the distance between the first and the last pillar in centimeters
  (without the width of the first and last pillar but including the pillars inbetween).
 */
object Pillars extends App {

  def distance(num_pill: Int, dist: Int, width: Int): Int = {


    val distance = (num_pill - 1) * 100 * dist
    val widthOfPillar = (num_pill - 2) * width
    val totalDistance = distance + widthOfPillar

    if (num_pill <= 1) 0
    else totalDistance
  }

  println(distance(0, 4, 500))

//much easier way
  def distances(n: Int, d: Int, w: Int): Int = (n - 1) * d * 100 + ((n - 2) max 0) * w
}