package lists

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class P06Test {

    @Test
    fun `empty list is palindrome`() {
        assertTrue(Nil.isPalindrome(), "Empty list should be a palindrome")
    }

    @Test
    fun `single element list is palindrome`() {
        val l = Cons(1 , Nil)
        assertTrue(l.isPalindrome(), "Single element list should be a palindrome")
    }

    @Test
    fun `list is palindrome`() {
        val l = makeMyListV2(listOf(1,2,3,2,1))
        assertTrue(l.isPalindrome(), "List should be a palindrome")
    }

    @Test
    fun `list is not a = palindrome`() {
        val l = makeMyListV2(listOf(1,2,3,4,2,1))
        assertFalse(l.isPalindrome(), "List should not be a palindrome")
    }
}