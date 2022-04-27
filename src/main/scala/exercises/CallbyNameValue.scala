package exercises

object CallbyNameValue extends App{
  //CALL BY VALUE
    //value is computer before the call
  //same value is used everywhere, no matter how many times

  def calledByValue(x:Long) = {
    println("this value is: " + x)
    println("this value is: " + x)
  }

  //def myFunction(x:Int): String =.. <actual value passed here
  //vala y = myFunction(2)... <the actual value (2) is here but then will be passed


  //CALL BY NAME
  //value is evaluated everytime the function
  //it delays the evaluation
  //expression is passed literally
  //expression is evaluated at every use within

  def calledByName(x: =>Long) = {
    println("this name is: " + x)
    println("this name is: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())


  /*
  this value is: 144387713582458
  this value is: 144387713582458

  this value is: 144387787393541
  this value is: 144387787456916
   */
}
