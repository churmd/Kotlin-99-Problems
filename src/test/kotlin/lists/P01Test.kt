package lists

import org.junit.jupiter.api.Test
import java.lang.IndexOutOfBoundsException
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class P01Test {

    @Test
    fun `last of empty list`() {
        val l1 = Nil
        assertFailsWith<IndexOutOfBoundsException> { l1.get(0) }
    }

    @Test
    fun `one element list`() {
        val l1 = Cons(1, Nil)
        assertEquals(1, l1.last(), "Could not get the last element of a single element list")
    }

    @Test
    fun `many element list`() {
        val l1 = makeMyListV2(listOf(1, 2, 3, 4, 5))
        assertEquals(5, l1.last(), "Could not get the last element list")
    }
}