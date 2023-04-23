import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Nephat Muchiri
 * Date 23/04/2023
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] input = {2,4,11,7};
        System.out.println("Output: " + Arrays.toString(twoSum(input, 9)));
    }

    private static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;

        for (int num : nums){
            int complement = target - num;
            if (map.containsKey(complement)){
                return new int[] {map.get(complement), index};
            }
            map.put(num, index++);
        }

        throw new IllegalArgumentException("No two sum for the solution");
    }
}
