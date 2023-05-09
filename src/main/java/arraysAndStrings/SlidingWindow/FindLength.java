package arraysAndStrings.SlidingWindow;

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


}
