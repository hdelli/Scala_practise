package lectures.part2basics
/*
 Novel and a Writer class
 writer: first name, surname, year birth
 -method fullname - returns full name and surname

 novel: name, year of release , author
 -method authorAge: gives year of release
 -method isWrittenBy(author)
 -method: copy(new year of release) = returns new instance of Novel

  */
object Exercise1 extends App{
  val writer = new Writer("Gillian", "Flynn", 1971)
}

class Writer (firstName: String, surname: String, val year:Int) {
  def fullName: String = firstName + " " + surname

}

class Novel(name: String, yearOfRelease: Int, author: Writer) {

  def authorAge: Int = yearOfRelease - author.year;
  def isWrittenBy(author: Writer) = author == this.author;
  def copyOfNewYearRelease(newYear: Int): Novel = new Novel(name, newYear, author)
}

