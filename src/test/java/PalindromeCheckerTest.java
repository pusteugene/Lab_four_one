import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @Test
    void isPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("racecar"));
        assertTrue(PalindromeChecker.isPalindrome("A man a plan a canal Panama"));
        assertFalse(PalindromeChecker.isPalindrome("hello"));
        assertFalse(PalindromeChecker.isPalindrome("Was it a car or a cat I saw?"));
        assertTrue(PalindromeChecker.isPalindrome("No lemon, no melon"));
    }
}