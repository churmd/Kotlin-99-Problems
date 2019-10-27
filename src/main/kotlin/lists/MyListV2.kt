package lists

import java.lang.IndexOutOfBoundsException

//object Nil : MyListV2<Nothing>()
class Nil<A> : MyListV2<A>()
data class Cons<A>(val value : A, val next : MyListV2<A>) : MyListV2<A>()

sealed class MyListV2<A> {
    fun isEmpty() : Boolean {
        return this is Nil
    }

    fun get(index : Int) : A {
        return getHelper(index, this)
    }

    private tailrec fun getHelper(index : Int, listV2 : MyListV2<A>) : A {
        return when (listV2) {
            is Nil -> throw IndexOutOfBoundsException()
            is Cons -> getHelper(index - 1, listV2.next)
        }
    }

    fun len() : Int {
        return lenHelper(0, this)
    }

    private tailrec fun lenHelper(acc : Int, listV2 : MyListV2<A>) : Int {
        return when (listV2) {
            is Nil -> acc
            is Cons -> lenHelper((acc + 1), listV2.next)
        }
    }
}

fun main() {
    // Need to specify type of nil which doesn't make much sense
    // Can change to definition to object and use Nothing as MyList generic
    // but then can't place in Cons constructor as generic type is now Nothing
    val l1 = Nil<Int>()
    val l2 = Cons(1, Cons(2, Nil()))
}

