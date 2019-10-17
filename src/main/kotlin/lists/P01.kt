package lists

/**
 * Returns the last item of a list
 */
fun <A> last(list: List<A>): A {
    return list[list.lastIndex]
}