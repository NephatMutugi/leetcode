package arraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {
    @Test
    public void testMergeSortedArray(){
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] result = MergeSortedArray.mergeSortedArray(arr1, arr2);
        assertArrayEquals(expected, result);

        int[] arr3 = {1, 2, 3};
        int[] arr4 = {4, 5, 6, 7, 8, 9};
        int[] expected2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result2 = MergeSortedArray.mergeSortedArray(arr3, arr4);
        assertArrayEquals(expected2, result2);

        int[] arr5 = {1, 1, 1, 1, 1};
        int[] arr6 = {2, 2, 2, 2, 2};
        int[] expected3 = {1, 1, 1, 1, 1, 2, 2, 2, 2, 2};
        int[] result3 = MergeSortedArray.mergeSortedArray(arr5, arr6);
        assertArrayEquals(expected3, result3);

        int[] arr7 = {10, 20, 30};
        int[] arr8 = {40, 50, 60, 70};
        int[] expected4 = {10, 20, 30, 40, 50, 60, 70};
        int[] result4 = MergeSortedArray.mergeSortedArray(arr7, arr8);
        assertArrayEquals(expected4, result4);
    }
}