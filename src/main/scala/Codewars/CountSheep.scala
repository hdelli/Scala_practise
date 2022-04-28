package Codewars

//If you can't sleep, just count sheep!!
//  Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
//  Input will always be valid, i.e. no negative integers.
object CountSheep extends App {


  def countingSheep(num: Int): String = {

    val sheep = num + " sheep..."
    if (num == 0) ""
    else if (num == 1) sheep
    else countingSheep(num - 1) + sheep


    //num = 2 therefore last else, 2-1 = 1 therefore:
    //countingSheep(1) + (2 sheep...)
    //1 sheep ... 2 sheep

    //num = 3

    //go through the else statement :
    //countingSheep(num-1) + sheep:
    //countingSheep(3-1) + 3 + " sheep..."
    //countingSheep(2) + "3 sheep ..  "
    // countingSheep(2-1) + sheep + "3 sheep ..  "
    //countingSheep(1) + "2 sheep..." + "3 sheep ..  "
    //1==1
    //else if is run
    //sheep + "2 sheep..." + "3 sheep ..  "
    // "1 + sheep.." + "2 sheep..." + "3 sheep ..  "


  }

  println(countingSheep(3))


}
