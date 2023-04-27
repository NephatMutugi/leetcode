package arraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    public void testReverseString() {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        char[] expectedOutput = {'o', 'l', 'l', 'e', 'h'};
        ReverseString.reverseString(input);
        assertArrayEquals(expectedOutput, input);
    }
}