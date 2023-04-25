package arraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortSquaredArraysTest {

    @Test
    public void testReturnSortedSquares(){
        int[] input = {-4, -2, 0, 2, 4};
        int[] expectedOutput = {0, 4, 4, 16, 16};
        int[] actualOutput = SortSquaredArrays.returnSortedSquares(input);

        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReturnSortedSquaresWithEmptyArray() {
        int[] input = {};
        int[] expectedOutput = {};
        int[] actualOutput = SortSquaredArrays.returnSortedSquares(input);

        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReturnSortedSquaresWithSingleElementArray() {
        int[] input = {5};
        int[] expectedOutput = {25};
        int[] actualOutput = SortSquaredArrays.returnSortedSquares(input);

        assertArrayEquals(expectedOutput, actualOutput);
    }
}