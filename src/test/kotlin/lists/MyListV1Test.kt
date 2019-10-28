package lists

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class MyListV1Test {

    @Test fun `create empty list`() {
        val emptyList = MyListV1<Int>()
        assertTrue(emptyList.isEmpty())
    }

    @Test fun `adding element creates non empty list`() {
        val list = MyListV1<Int>()
        assertTrue(list.isEmpty())
        list.add(1)
        assertFalse( list.isEmpty() )
    }
}