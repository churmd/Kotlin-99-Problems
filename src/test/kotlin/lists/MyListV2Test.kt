package lists

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class MyListV2Test {

    @Test
    fun `checking if lists are empty`() {
        val emptyList = Nil
        assertTrue("empty list is not empty") { emptyList.isEmpty() }

        val nonEmptyList = Cons(1, Nil)
        assertFalse("non empty list is empty") { nonEmptyList.isEmpty() }
    }


    @Test
    fun `getting index of empty list fails`() {
        val l1 = Nil
        assertFailsWith<IndexOutOfBoundsException> { l1.get(0) }
    }

    @Test
    fun `getting indexes of list`() {
        val l1 = makeMyListV2(listOf(1, 2, 3, 4, 5))
        assertEquals(1, l1.get(0), "Index 0 is not the first element")
        assertEquals(5, l1.get(4), "Index 4 is not the last element")
        assertEquals(3, l1.get(2), "Index 3 is not the third element")
    }

    @Test
    fun `length of lists`() {
        val emptyList = Nil
        assertEquals(0, emptyList.len(), "Empty list is not length 0")

        val oneElemList = Cons(1, Nil)
        assertEquals(1, oneElemList.len(), "One element list is not length one")

        val tenElemList = makeMyListV2(listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9))
        assertEquals(10, tenElemList.len(), "Ten element list is not length ten")
    }

    @Test
    fun `empty lists are equal`() {
        assertTrue(Nil.myEquals(Nil), "Empty lists are not equal to each other")
    }

    @Test
    fun `non empty list does not equal empty list`() {
        val l = Cons(1, Nil)
        assertFalse(l.myEquals(Nil), "Non empty list myEquals empty list")
        assertFalse(Nil.myEquals(l), "Empty list myEquals non empty list")
    }

    @Test
    fun `matching lists are equal`() {
        val l1 = makeMyListV2(listOf(1,2,3,4,5))
        val l2 = makeMyListV2(listOf(1,2,3,4,5))
        assertTrue(l1.myEquals(l2), "Lists are not equal")
        assertTrue(l2.myEquals(l1), "Lists are not equal")
    }

    @Test
    fun `non matching lists are not equal`() {
        val l1 = makeMyListV2(listOf(1,2,3,4,5))
        val l2 = makeMyListV2(listOf(1,2,3,4,6))
        assertFalse(l1.myEquals(l2), "Lists are equal")
        assertFalse(l2.myEquals(l1), "Lists are equal")
    }
}