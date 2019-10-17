package lists

import org.junit.jupiter.api.Test
import java.lang.IndexOutOfBoundsException
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class P02Test {

    @Test
    fun `penultimate element from list`() {
        assertEquals(2, penultimate(listOf(1, 2, 3)), "Did not get second to last element")
    }

    @Test
    fun `penultimate element from single element list`() {
        assertFailsWith<IndexOutOfBoundsException> {
            assertEquals(1, penultimate(listOf(1)))
    }
}
}