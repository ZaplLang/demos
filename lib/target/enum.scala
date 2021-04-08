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
// counts the amount of items in the list.
def count(list: List[Any], c: scala.Int): scala.Int = if (Enum.empty(list)) c
else count(Enum.drop(list, 1), c + 1)
// drops the [n] amount of items of a list.
def drop(list: List[Any], n: scala.Int): List[Any] = list.drop(n)
def empty(list: List[Any]): scala.Boolean = list.eq(List())
}
val a_list = List("hello", " ", "world", "!")
println(Enum.count(a_list, 0))
println(Enum.drop(a_list, 1))
println(Enum.empty(a_list))
}