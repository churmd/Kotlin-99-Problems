package lists


// Use a sealed class to make equivalent of
// data List a = EmptyList | Node a

private data class Node<A>(var value: A, var prev: Node<A>? = null, var next: Node<A>? = null)

class MyListV1<A> {

    private var head: Node<A>? = null

    fun isEmpty(): Boolean = head == null

    fun add(value: A) {
        if (head == null) {
            head = Node<A>(value)
            return
        }

        var current = head
        while (current?.next != null) {
            current = current.next
        }
        current?.next = Node(value)
    }

    override fun toString(): String {
        if (head == null) {
            return "[]"
        }

        var s = ""
        var current = head
        while (current != null) {
            s += current.value.toString()
            if (current.next != null) {
                s += ","
            }
            current = current.next
        }
        return "[$s]"
    }
}

fun main() {
    val myList = MyListV1<Int>()

    println(myList)
    println("Is list empty? ${myList.isEmpty()}")

    myList.add(1)
    println(myList)

    myList.add(2)
    println(myList)
}