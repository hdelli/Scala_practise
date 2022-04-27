package exercises

object Functions extends App {
  //each parameter has a name and a type then a column
  //return type of function after
  //compiler can figure out the return types of functions if we don't specify (We say it can infer the types of vars

  def aFunction(a: String, b: Int): String = {

    a + " " + b //string concatination //single expression or can be in block
    //remember the result is the end of the line
  }
  println(aFunction("hello", 3))




  def aParameterlessFunction(): Int = 42;
  println(aParameterlessFunction())
  println(aParameterlessFunction)





  //RECURSIVE FUNCTION
  //for recursive it is important to note you need to mention a return type as the compiler will complain; if it is recursive it needs results type
  //instead of using loops use recursion !
  def aRepeatedFunction(aString: String, n: Int): String = {

    //it is equal to one then return a string else return the string and the repeated function minus 1
    if (n == 1) aString //return a string otherwise:
    else aString + aRepeatedFunction(aString, n - 1)

  }

  println(aRepeatedFunction("hello", 3))


  //SIDE EFFECTS
  //you can use unit as a return type this means you are only executing side effects
  //remember side effects are: anything but something that returns a value
  //for example a function that returns a value is not a side effect
  //so side effects are anything an expression

  //remember unit is void - used when the return type does not return anything
  //we normally need functions with side effects when printing, displaying and logging something to a file
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }


  //EXERCISES

  /*
  1.Greeting function that takes two parameters name and age that will return "Hi, my name is $name and I am $age years old"

  2. Factorial function - mathematical function 1 * 2 * 3 .. n = recursive function

  3. A Fibonacci function
  f(1) = 1
  f(2) =
  f(n) = f(n-1) + f(n-2)

  4. Tests if a number is prime
   */


  //1

  def aGreetingFunction(name: String, age: Int): String =
    "Hi my name is " + age + " and I am " + name + " years old."

    println(aGreetingFunction("David", 12))

  //CODEWARS EXERCISES
  //1. Make a function that will return a greeting statement that uses an input; your program should return, "Hello, <name> how are you doing today?".

  def anotherGreetingFunction (name: String): String =
    "Hello, " + name + " how are doing today? "

  println(anotherGreetingFunction("Zoe"))

    //2. Repeat a string
  def repeatStr (aString: String, n:Int): String = {
    //this is saying if the number of times you want to repeat it is 1 then just return once

    if (n==1) aString
  //else return the string and the function which is a string then minus 1 because we do not want to include the first one
    else aString + repeatStr(aString, n-1)
  }

  println(repeatStr("repeated string ", 7))


  //3. Complete the solution so that it reverses all of the words within the string passed in.
  val sentence = "hello world";
  println(sentence.reverse)



  //4. Reverse every other word in a given string, then return the string. Throw away any leading or trailing whitespace,
  // while ensuring there is exactly one space between each word. Punctuation marks should be treated as if they are a part of the word in this kata.

  val string = "suad, is overly excited to understand scala!!"

  val trimmedList : Array[String] = string.split(" ")
  //println((trimmedList.mkString(" ")))

  val result: IndexedSeq[String] =
    for
      (word <- trimmedList.indices) yield {
      if (word % 2 != 0) trimmedList(word).reverse
      else trimmedList(word)}


  println(result.mkString(" "))


  //5.We need a function that can transform a number into a string.
  val number : Int= 1
  println(number.toString)

//TYPE INFERENCE
  //the compiler is able to do many steps to work out the type of values:
  val message = "hello, world" //it is able to work out it is a string
  //vs
  val messages:String ="hello world"

 // val y = x + "items" //int + string = string therefore y is a string

//compiler is also able to figure out the return types of functions

  def succ(x:Int) = x + 1;

  //sometimes it is not possible to find it
  //thus try to help the compiler



  //  def reverser(input: Array[String]): String = {
//
//  }

}


