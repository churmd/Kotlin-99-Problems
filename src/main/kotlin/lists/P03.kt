package lists

// Not extending MyListV2 with this as it is equivalent to get
fun <A> nth(n: Int, list: MyListV2<A>): A {
    return list.get(n)
}