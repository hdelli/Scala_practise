package exercises

import scala.annotation.tailrec

object Recursions extends App {


      //remember this is a recursive function
  //use this to loop through
  def factorial(n:Int): Int=
    if (n <= 1) 1
    else {
      println("computing factorial of " + n + " - I first need a factorial of " + (n + 1))


      val result = n * factorial(n - 1)
      println("computer factorial " + n)

      result
    }
    println(factorial(10))

    //compiler will crash when factorial is 5000

  def anotherFactorial(n:Int): Int= {
    @tailrec //can add this annotation
    def factHelper(x:Int, accumulator:Int):Int=
      if(x <= 1) accumulator
      else factHelper(x-1, x * accumulator) //tail recursion = use recursive call as the last expression
        factHelper(n,1)
  }

  //when you need loops, use tail recursions
  //tail recursions simply means function calling itself
  //theres no need to keep a record of the previous functions

  /*
  anotherFactorial(10) = factHelper(10,1)
  =factHelper(9, 10 *1)
  =factHelper(8, 9 * 10 *1)
  =factHelper(7, 8 * 9 * 10 *1)
  ...
  =factHelper(2, 3 * 4 * .. 10 * 1)
  =factHelper(1, 1* 2 *3 *4 * 5 .. 10 )
  =1 * 2 * 3 * ... 10

   */


  //tail recursion
/*factorial 4 = 4 * 3 * 2 * 1 = 24
  //factorial 1 = 1
  // factorial n = n * fac(n-1) =recurssive as it is times it with itself

//fac(n-1)

  fac 4 = 4 * fac(4-1 = 3)
        = 4 * ( 3* fac 2)
        = 4 * (3* (2* fac1))
        = 4 * (3 * (2*1))
        =4*(3*2)
        =4 * 6
        =24
        this is insufficient = it is unwhining all of the factorials
        expression is expanding and thus insufficient in terms of memory


    a more efficient:
    this is multiplying as it goes and does not leave it near the end
    fac n = go n 1
    go 1 a = a
    go n a = go(n-1)(a*n)


    fac 4
 */



  //EXERCISES
  // 1.Concatenate a string n times
   def strings(word:String, n:Int, accumulator:String): String = {
     if(n <=0) accumulator
      else strings(word, n-1, word + accumulator)
    }

  println(strings("words",6,""))


  //2. isPrime function tail recursive
//  def primeNum(n:Int): Boolean ={
//    def isPrimeTailrec(t:Int, isStillPrime:Boolean): Boolean=
//      if(!isStillPrime) false
//      else if (t <= 1) true
//      else isPrimeTailrec(t-1, n % t !=0 && isStillPrime) true
//
//  }


}
