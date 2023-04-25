package arraysAndStrings;

/**
 * @Author Nephat Muchiri
 * Date 24/04/2023
 */


/* Given a sorted array of unique integers and a target integer,
return true if there exists a pair of numbers that sum to target,
false otherwise.*/
public class CheckForTarget {

    public static boolean checkForTarget(int [] input, int target){
        int left = 0;
        int right = input.length-1;

        while (left < right){
            int currentSum = input[left] + input[right];
            if (currentSum == target){
                return true;
            }
            if (currentSum < target){
                left++;
            } else {
                right--;
            }
        }

        return false;
    }
}
