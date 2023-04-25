package arraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPalindromeTest {

    @Test
    public void checkPalindrome(){
        assertTrue(CheckPalindrome.checkPalindrome("racecar"));
        assertTrue(CheckPalindrome.checkPalindrome("deified"));
        assertTrue(CheckPalindrome.checkPalindrome("level"));
        assertTrue(CheckPalindrome.checkPalindrome("madam"));
        assertFalse(CheckPalindrome.checkPalindrome("hello"));
        assertFalse(CheckPalindrome.checkPalindrome("world"));
        assertFalse(CheckPalindrome.checkPalindrome("notapalindrome"));
    }
}