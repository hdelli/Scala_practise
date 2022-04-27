package exercises

object Expressions extends App {

  val x = 1 + 2; //EXPRESSION; they have a type in this cade an in and a compiler is able to infer
  println(x);

  println(2 + 3 * 4)
  //+ = * / | & ^ << >> >>> these are mathematical expressions

  //relational operators for equality - expression
  // == != > >= < <=

  //boolean operators
  println(!(1==x));
  //logical negation
  // ! && ||

  var aVariable = 2;
  aVariable += 3 //also works with -= *= /= ... all side effects
  //this will only work with variables

  //statements/intructions(DO) vs expressions (VALUE)
  //DO: do this
  //expression has a value and or type

  //IF expression
  val aCondition = true;
  val aConditionValue = if (aCondition) 5 else 3;  //IF EXPRESSION
  println(aConditionValue)


  //IF expressions will always return a value it is not an instruction per say
//  if (a == b) {
//    doSomething()
//  } else {
//    doSomethingElse()
//  }
  var i = 0;
  while (i < 10) {
    println(i)
    i += 1
  }
  //while loops are side effects
  //but NEVER use while loops in your scala code

  //everything in scala is an expression
  //var, packages are not expressions but everything else is an expression


  //UNITS
  val aWeirdValue= (aVariable = 3) //the weird value is = Unit == void .. dont return anything meaningful
  println(aWeirdValue) //it will print ()
  //it can only hold this because it is a unit
  //side effects in scala are actually returning units
  //expressions return units

  //side effects println(), while, reassigning = expressions therefore returning unit


  //CODE BLOCKS
  //Special kind of expressions
  //the value of the block is the value of its last expression

//  val aCodeBlock = {
//    //Code block everything inside here
//    //they are expressions
//    //the value of the code block is the last expression
//    //they can have their own variables etc
//    val y = 2;
//    val x = y + 1;
//    if (z > 2) "hello" else "goodbye"
//  }

  //val anotherValue = z +1; ... cannot do this

  //1. what is the difference between "hello world" vs println("hello world")?
  //"hello world" is a type of string (literal) and println is printing to the console a string- it is a side effect = expression and unit


  //2.
  //it is a code block:
  //relational boolean
  val someValue = (
    2 < 3
  )



  val someOtherValue = (
    if(someValue) 239 else 986

  )


}
