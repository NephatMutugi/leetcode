package arraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

    @Test
    public void testIsSubsequence() {
        IsSubsequence subsequence = new IsSubsequence();
        assertTrue(subsequence.isSubsequence("abc", "ahbgdc"));
        assertTrue(subsequence.isSubsequence("ace", "abcde"));
        assertFalse(subsequence.isSubsequence("axc", "ahbgdc"));
        assertFalse(subsequence.isSubsequence("xyz", "abcde"));
        assertFalse(subsequence.isSubsequence("abc", ""));
    }
}