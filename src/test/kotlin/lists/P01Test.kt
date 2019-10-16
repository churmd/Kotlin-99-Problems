package lists

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class P01Test {
    @Test fun `one element list`() {
        assertEquals(1, last(listOf(1)), "Could not get the last element of a single element list")
    }

    @Test fun `many element list`() {
        assertEquals(5, last(listOf(1,2,3,4,5)), "Could not get the last element list")
    }
}