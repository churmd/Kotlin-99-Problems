package lists

import java.lang.IndexOutOfBoundsException

object Nil : MyListV2<Nothing>()
class Cons<A>(val value: A, val next: MyListV2<A>) : MyListV2<A>()

sealed class MyListV2<out A> {

    fun isEmpty(): Boolean {
        return this is Nil
    }

    override fun toString(): String = when (this) {
        is Nil -> "[]"
        is Cons -> toStringHelper("[", this)
    }

    private tailrec fun toStringHelper(acc: String, list: Cons<A>): String {
        return when (list.next) {
            is Nil -> acc + "${list.value}]"
            is Cons -> toStringHelper(acc + "${list.value}, ", list.next)
        }
    }

    fun get(index: Int): A {
        return when (this) {
            Nil -> throw IndexOutOfBoundsException()
            is Cons -> getHelper(index, this)
        }
    }

    private tailrec fun getHelper(index: Int, listV2: Cons<A>): A {
        if (index == 0) {
            return listV2.value
        }

        return when (listV2.next) {
            is Nil -> throw IndexOutOfBoundsException()
            is Cons -> getHelper(index - 1, listV2.next)
        }

    }

    fun len(): Int {
        return lenHelper(0, this)
    }

    private tailrec fun lenHelper(acc: Int, listV2: MyListV2<A>): Int {
        return when (listV2) {
            is Nil -> acc
            is Cons -> lenHelper((acc + 1), listV2.next)
        }
    }
}

fun <A> makeMyListV2(list: List<A>): MyListV2<A> {
    val listRev = list.reversed()
    var myListV2: MyListV2<A> = Nil
    for (elem in listRev) {
        myListV2 = Cons(elem, myListV2)
    }
    return myListV2
}

fun main() {
    val l1 = Nil
    val l2 = Cons(1, Cons(2, Nil))

    println(l1)
    println(l1.len())
    println(l2)
    println(l2.len())
    println(l2.get(1))

    val l3 = makeMyListV2(listOf(1, 2, 3, 4))
    println(l3)
    println(l3.len())
}

