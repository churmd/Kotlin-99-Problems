package lists

/**
 * Returns the last item of a list
 */
fun <A> MyListV2<A>.last(): A {
    val length = this.len()
    if (length == 0) {
        throw NoSuchElementException()
    } else {
        return this.get(length - 1)
    }
}