package lists

fun <A> MyListV2<A>.isPalindrome(): Boolean {
    return this.myEquals(this.reverse())
}