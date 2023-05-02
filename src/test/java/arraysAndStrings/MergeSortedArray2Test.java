package arraysAndStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArray2Test {

    @Test
    public void testMerge() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        MergeSortedArray2.merge(nums1, m, nums2, n);

        int[] expected = {1, 2, 2, 3, 5, 6};
        Assertions.assertArrayEquals(expected, nums1);
    }
}