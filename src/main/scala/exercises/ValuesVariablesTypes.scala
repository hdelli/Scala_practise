package exercises
//  def main(args: Array[String]): Unit = {
//    println("im ready to learn scala")
//  }
object ValuesVariablesTypes extends App {
  //we need object and extends app to run the code in the ID

  val x: Int = 42;
  println(x);

  val y = 42;
  //type of vals are optional
  //the compiler will be able to infer types; we dont usually say the type for vals
  println(y);

  //if you try to give a new value to x
  //x = 2
  //you cannot do this as it is a val they are IMMUTABLE

  val aString: String = "hello";
  val anotherString = "goodbye";
  //if you write multiple expressions in one line you will need a semi-colon

  val aChar: Char = 'a';
  val aBoolean: Boolean = false;
  val aInt: Int = x;
  val aShort: Short = 4613; // 4 bytes
  val aLong: Long = 45678224562L //you need to put an L at the end
  val aFloat: Float = 2.0F //a decimal number with F at the end without it it will recognise it as a double
  val aDouble: Double = 3.14 //this is more precise than a float and can store 64 bits



  //variables
  //they can be reassigned
  //used as side effects are useful in seeing what our programs doing
  //mutable and prefer vals over vars
  
  var aVariable: Int = 4;
  aVariable = 5;



}
