package arraysAndStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    public void shouldReturnCorrectIndices(){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldThrowExceptionForNoSolution() {
        int[] nums = {2, 7, 11, 15};
        int target = 4;

        TwoSum twoSum = new TwoSum();
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                twoSum.twoSum(nums, target));
    }
}