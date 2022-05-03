package lectures.part2basics

object OOBasics extends App{

  val person = new Person("john", 20) //correctly constructed
  println(person.age)
  person.greet("Daniel")
  //age is a class parameter but not fields that you can access
  //convert a class parameter to a field add a val/var to the class parameters
  //classes are blueprints and how things work - functionality/behaviour

}
//constructor - every person instance will have a name and age
class Person(name: String, val age:Int)  {
  //body defines the implementation of this class
  //the value of this code block is ignored but everything is going to be exacuted
  //val/var definitions are fields therefore you can use it outside such as person.x
  val x = 2

  //you can have expressions and packages
  println(1+3)

  //method
  //this.name is accessing the parameter of the constructor
  def greet(name:String):Unit = println(s"${this.name} says:Hi, $name")

  //overloading - supplying same name def but different parameters and/or return type
  //if the method is using name parameter we have to use this. but if we dont then it is fine it will refer to the parameter without the field
  def greet(): Unit = println(s"Hi i am $name")
  //def greet():Int = 42 <== this is not overloading the compiler wont know which greet to refer to

  //multiple constructors
  //auxiliary constructor
  def this(name: String) = this(name, 0) //can only be another constructor that is all - this is used for having a default
  def this() = this("john doe")




  /*
  Counter class
  -receives an int value
  -method current count
  -method to increment/decrement => new Counter
  -overload inc/dec to receive an amount
   */
}

