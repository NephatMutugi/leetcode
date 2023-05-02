import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Nephat Muchiri
 * Date 21/04/2023
 */
public class Main {
    public static void main(String[] args) {

        /*---------------- CHECK PALINDROME ----------------*/
        System.out.println("IS PALINDROME: " + checkPalindrome("racecar"));
        System.out.println("IS PALINDROME: " + checkPalindrome("hello"));


        /*---------------- CHECK IS SUBSEQUENCE ----------------*/
        String small = "abc";
        String large = "Nephat B Muchiri";
        System.out.printf("Is \"%s\" Substring of \"%s\": %s", small, large, isSubsequence(small, large));

        /*---------------- CHECK FOR TARGET ----------------*/
        int target = 12;
        int[] input = {1, 3, 4, 5, 7, 9, 10};
        System.out.printf("\nINPUT: %s, TARGET: %s. \nIs Target: %s", Arrays.toString(input), target, checkForTarget(input, target));

        /*---------------- MERGE SORTED ARRAY ----------------*/
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        System.out.printf("\n\n\nArray 1: %s\nArray 2: %s\nMerged Array: %s",
                Arrays.toString(arr1), Arrays.toString(arr2), mergeSortedArr(arr1, arr2));

    }

    /*---------------- MERGE SORTED ARRAY ----------------*/
    private static List<Integer> mergeSortedArr (int[] arr1, int[] arr2){
        List<Integer> sortedArr = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length){
           if (arr1[i] < arr2[j]){
               sortedArr.add(arr1[i++]);
           } else {
               sortedArr.add(arr2[j++]);
           }
        }

        while (i < arr1.length){
            sortedArr.add(arr1[i++]);
        }

        while (j < arr2.length){
            sortedArr.add(arr2[j++]);
        }

        return sortedArr;
    }

    /*---------------- CHECK FOR TARGET ----------------*/
    private static boolean checkForTarget(int[] input, int target){
        int i = 0;
        int j = input.length-1;

        while (i < j){
            int sum = input[i] + input[j];
            if (sum == target)
                return true;
            if (sum > target){
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    /*---------------- CHECK IS SUBSEQUENCE ----------------*/
    private static boolean isSubsequence (String small, String large){
        int i = 0;
        int j = 0;
        small = small.toLowerCase();
        large = large.toLowerCase();
        while (i < small.length() && j < large.length()){
            if (small.charAt(i) == large.charAt(j)){
                i++;
            }
            j ++;
        }

        return i == small.length();
    }

    /*---------------- CHECK PALINDROME ----------------*/
    private static boolean checkPalindrome(String input){
        int left = 0;
        int right = input.length()-1;

        while (left < right){
            if (input.charAt(left++) != input.charAt(right--))
                return false;
        }
        return true;
    }

}
