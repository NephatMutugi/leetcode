package arraysAndStrings.SlidingWindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindLengthTest {


    @Test
    public void testFindLengthWithKGreaterThanSum() {
        int[] input = {1, 2, 3, 4, 5};
        int k = 20;
        int expected = 5;
        int actual = FindLength.findLength(input, k);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLengthWithKEqualToSum() {
        int[] input = {1, 2, 3, 4, 5};
        int k = 15;
        int expected = 5;
        int actual = FindLength.findLength(input, k);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLengthWithKLessThanSum() {
        int[] input = {1, 2, 3, 4, 5};
        int k = 9;
        int expected = 3;
        int actual = FindLength.findLength(input, k);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLengthWithKEqualToSingleElement() {
        int[] input = {1, 2, 3, 4, 5};
        int k = 15;
        int expected = 5;
        int actual = FindLength.findLength(input, k);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLengthWithEmptyInput() {
        int[] input = {};
        int k = 5;
        int expected = 0;
        int actual = FindLength.findLength(input, k);
        assertEquals(expected, actual);
    }

}