package exercises

object StringOps extends App{

  //declare a string
  val str: String = "Hello, I am learning scala"

  //substring takes in one or two indices and has multiple implementations
  //index 7 inclusive and index 11 exclusive (wont include 11)
  println(str.substring(7,11))
  println(str.charAt(2))
  println(str.split(" ").toList) //turns every string into a list
  println(str.startsWith("Hello"))  //boolean
  println(str.replace(" ", "-")) //changes all the spaces to -
  println(str.toLowerCase())
  println(str.length) //returns the length of the string


  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')  //appending the character to a string and prepending , a is prepending and z is appending
  println(str.reverse)
  println(str.take(2))


  //scala specific: String interpolators
  //S-Interpolators
  val name = "David"
  val age= 12
  val greeting = s"Hello, my name is $name and i am $age years old" //$injecting the val inside
  val anotherGreeting = s"Hello, my name is $name and i am ${age + 1} years old" //$injecting the val inside


  //F-interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute" //the % allows you to give back 2 strings and 2 decimals
  //uf you use the f at the beginning it is an f interpolated string. 2.2f is a float number = 2 characters total and min. 2 decimals
  //can check the type correctness
  // %3d requires int
  println(myth)


  //raw-interpolator
  println(raw"this is a \n newline") //will literally print this
  val escaped = "this is a \n newline"
  println(raw"$escaped") //now the text is printed into two lines


}
