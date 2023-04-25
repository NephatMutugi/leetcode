package arraysAndStrings;

/**
 * @Author Nephat Muchiri
 * Date 24/04/2023
 */


/* Given a sorted array of unique integers and a target integer,
return true if there exists a pair of numbers that sum to target,
false otherwise.*/
public class CheckForTarget {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8,9};
        int target = 15;
        System.out.println("HAS TARGET SUM: " + checkForTarget(input, target));
    }

    private static boolean checkForTarget(int [] input, int target){
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
