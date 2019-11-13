package lists

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class P05Test {

    @Test
    fun `reverse empty list`() {
        val l = Nil
        assertEquals(Nil, l.reverse(), "Empty list reversed does not equal itself")
    }

    @Test
    fun `reverse single element list`() {
        val l = Cons(1, Nil)
        val lReversed = l.reverse()
        val expected = Cons(1, Nil)
        assertTrue(lReversed.myEquals(expected), "Single element list reversed does not equal itself")
    }

    @Test
    fun `reverse element list`() {
        val l = makeMyListV2(listOf(1,2,3,4,5,6))
        val lReversed = l.reverse()
        val expected = makeMyListV2(listOf(6,5,4,3,2,1))
        assertTrue(lReversed.myEquals(expected), "Reversed list does not equal expected")
    }
}