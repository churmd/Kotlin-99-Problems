package lists

fun <A> last(list: List<A>): A {
    return list[list.lastIndex]
}