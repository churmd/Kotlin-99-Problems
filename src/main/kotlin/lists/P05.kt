package lists

fun <A> MyListV2<A>.reverse(): MyListV2<A> {
    return reverseHelper(this, Nil)
}

private tailrec fun <A> reverseHelper(list : MyListV2<A>, reversed : MyListV2<A>): MyListV2<A> {
    return when (list) {
        Nil -> reversed
        is Cons -> reverseHelper(list.next, Cons(list.headValue, reversed))
    }
}