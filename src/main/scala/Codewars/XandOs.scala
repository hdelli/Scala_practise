package Codewars
  /*
  Grade 7
Check to see if a string has the same amount of 'x's and 'o's.
The method must return a boolean and be case insensitive. The string can contain any char.
Examples input/output:
  XO("ooxx") => true
  XO("xooxx") => false
  XO("ooxXm") => true
  XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
  XO("zzoo") => false
   */

object XandOs extends App {
  def xo(str: String): Boolean = {

    val countO = str.count(_ == 'o') | str.count(_ =='O')
    val countX = str.count(_ == 'x') | str.count(_ =='X')
    val emptyString: Boolean = str.isEmpty

    countO == countX &&  str.contains("""x""") && str.contains("""o""") || str.contains("""X""") && str.contains("""O""") && emptyString



  }

  println(xo("XO"))


}
