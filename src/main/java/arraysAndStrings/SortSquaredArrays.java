package arraysAndStrings;

import java.util.Arrays;

/**
 * @Author Nephat Muchiri
 * Date 21/04/2023
 */

/*
 * In this challenge, you are given an array as an input,
 * square it and order the results in ascending order
 * */

public class SortSquaredArrays {

    public static int[] returnSortedSquares(int[] input){
        int[] squaredArray = new int[input.length];
        int i = 0;
        for (int num : input){
            squaredArray[i] = num * num;
            i++;
        }

        Arrays.sort(squaredArray);
        return squaredArray;
    }
}
