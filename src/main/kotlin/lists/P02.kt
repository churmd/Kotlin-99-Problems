package lists

/**
 * Returns the second to last element of a list
 */
fun <A> MyListV2<A>.penultimate(): A {
    val penultimateIndex = this.len() - 2
    if (penultimateIndex < 0) {
        throw NoSuchElementException()
    } else {
        return this.get(penultimateIndex)
    }

}