package lists

// Not extending MyListV2 with this as it is equivalent to len
fun <A> length(list: MyListV2<A>) : Int = list.len()