package lists

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class P03Test {

    @Suppress("IMPLICIT_NOTHING_AS_TYPE_PARAMETER")
    @Test
    fun `getting index of empty list fails`() {
        val l1 = Nil
        assertFailsWith<IndexOutOfBoundsException> { nth(0, l1) }
    }

    @Test
    fun `getting indexes of list`() {
        val l1 = makeMyListV2(listOf(1, 2, 3, 4, 5))
        assertEquals(1, nth(0, l1), "Index 0 is not the first element")
        assertEquals(5, nth(4, l1), "Index 4 is not the last element")
        assertEquals(3, nth(2, l1), "Index 3 is not the third element")
    }
}