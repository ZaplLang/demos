object Application extends App {
// Enum
// ---
// 
// A bunch of functions to be used with lists.
//
// Author: https://github.com/zana-a/
// License: MIT
//
object Enum {
// Counts the amount of items in the list.
def count(list: List[Any], c: scala.Int): scala.Int = if (list.eq(List())) c
else count(list.drop(1), c + 1)
def drop(list: List[Any], n: scala.Int): List[Any] = list.drop(n)
}
println(Enum.count(List(1, 2, 3, 4, 5, 6, "hi", List()), 0))
println(Enum.drop(List(1, 2, 3, 4, 5, 6, "hi", List()), 6))
}