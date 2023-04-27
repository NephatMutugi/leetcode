package arraysAndStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class MergeSortedArrayTest {
    @Test
    public void testMergeSortedArray(){
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = MergeSortedArray.mergeSortedArray(arr1, arr2);
        Assertions.assertEquals(expected, result);

        int[] arr3 = {1, 2, 3};
        int[] arr4 = {4, 5, 6, 7, 8, 9};
        List<Integer> expected2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer>  result2 = MergeSortedArray.mergeSortedArray(arr3, arr4);
        Assertions.assertEquals(expected2, result2);

        int[] arr5 = {1, 1, 1, 1, 1};
        int[] arr6 = {2, 2, 2, 2, 2};
        List<Integer>  expected3 = Arrays.asList(1, 1, 1, 1, 1, 2, 2, 2, 2, 2);
        List<Integer>  result3 = MergeSortedArray.mergeSortedArray(arr5, arr6);
        Assertions.assertEquals(expected3, result3);

        int[] arr7 = {10, 20, 30};
        int[] arr8 = {40, 50, 60, 70};
        List<Integer>  expected4 = Arrays.asList(10, 20, 30, 40, 50, 60, 70);
        List<Integer>  result4 = MergeSortedArray.mergeSortedArray(arr7, arr8);
        Assertions.assertEquals(expected4, result4);
    }
}