package org.neph.ArraysAndStrings;

/**
 * @Author Nephat Muchiri
 * Date 21/04/2023
 */
public class CheckPalindrome {
    public static void main(String[] args) {
        String input  = "racecar";
        System.out.println("IS PALINDROME: " + checkPalindrome(input));
    }

    private static boolean checkPalindrome(String input){
        int left = 0;
        int right = input.length()-1;
        while (left < right){
            if (input.charAt(left) !=  input.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
