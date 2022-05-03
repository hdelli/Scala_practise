package Codewars
/*
Your goal in this kata is to implement a difference function, which subtracts one list from another
and returns the result.
It should remove all values from list a, which are present in list b keeping their order.
arrayDiff(Seq(1, 2), Seq(1)) == Seq(2)
If a value is present in b, all of its occurrences must be removed from the other:
arrayDiff(Seq(1, 2, 2, 2, 2, 2, 3), Seq(2)) == Seq(1, 3)
 */
object ArrayDiff extends App {
  def arrayDiff(a: Seq[Int], b: Seq[Int]) = {

    if (b.isEmpty) a
    else if (a.isEmpty) a
    else  {for (n <- a) yield {
      for (m <-b) yield if (n==m)  a.filter(_.==((n)))
        }
    }
//      a.filter(_.!=(b(n)))}
    }

  println(arrayDiff(Seq(1,2,3,4,4), Seq(3,4)))

}
