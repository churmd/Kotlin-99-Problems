package lists

/**
 * Returns the second to last element of a list
 */
fun <A> penultimate(list: List<A>): A = list[list.lastIndex - 1]