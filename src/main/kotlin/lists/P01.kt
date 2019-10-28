package lists

/**
 * Returns the last item of a list
 */
fun <A> MyListV2<A>.last(): A {
    return when (this) {
        Nil -> throw NoSuchElementException()
        is Cons ->
            when (this.next) {
                Nil -> this.value
                is Cons -> this.next.last()
            }
    }
}