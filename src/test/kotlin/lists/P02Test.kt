package lists

import org.junit.jupiter.api.Test
import java.lang.IndexOutOfBoundsException
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class P02Test {

    @Test
    fun `penultimate element from list`() {
        val l1 = makeMyListV2(listOf(1, 2, 3))
        assertEquals(2, l1.penultimate(), "Did not get second to last element")
    }

    @Test
    fun `penultimate element from single element list`() {
        val l1 = makeMyListV2(listOf(1))
        assertFailsWith<NoSuchElementException> {
            assertEquals(1, l1.penultimate())
        }
    }

    @Test
    fun `penultimate element from empty list`() {
        val l1 = ArrayList<Int>()
        val l2 = makeMyListV2(l1)
        assertFailsWith<NoSuchElementException> {
            assertEquals(1, l2.penultimate())
        }
    }

}