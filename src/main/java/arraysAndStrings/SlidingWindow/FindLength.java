package arraysAndStrings.SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Nephat Muchiri
 * Date 09/05/2023
 */
public class FindLength {

    public static int findLength (int[] input, int k){
        int left = 0, ans = 0, curr = 0;

        for (int right = 0; right < input.length; right++){
            curr += input[right];
            while (curr > k){
                curr-=input[left];
                left++;
            }

            ans = Math.max(ans, right-left + 1);
        }

        return ans;
    }

    public static Integer[] findLongestSub(int [] nums, int k){
        int left = 0, curr = 0, ans = 0;
        Map<Integer, Integer[]> response = new HashMap<>();
        for (int right = 0; right < nums.length; right++){
            curr += nums[right];

            while (curr > k){
                curr -= nums[left];
                left++;
            }


            // ans = Math.max(ans, right-left+1);
            if (ans < (right - left) + 1){
                ans = (right - left +1);
                response.put(ans, new Integer[]{left, right});
            }

        }

        int maxKey = maxKey(response);
        System.out.printf("Longest Window Size: %s\n", maxKey);
        return response.get(maxKey);
    }


    private static int maxKey(Map<Integer, Integer[]> inputMap){
        int maxKey = 0;
        for (int key: inputMap.keySet()){
            if (key > maxKey){
                maxKey = key;
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {
        int[] input = {1, 10, 1, 3, 4, 5};
        int k = 10;

        Integer[] max = findLongestSub(input, k);
        System.out.printf("Window Indices: %s\n",Arrays.toString(max));
    }

}
