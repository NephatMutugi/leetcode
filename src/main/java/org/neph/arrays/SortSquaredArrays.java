package org.neph.arrays;

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

    public static void main(String[] args) {
        int[] input = {-1, 10,0, 2, 12};
        System.out.println("INPUT ARRAY: " + Arrays.toString(Arrays.stream(input).toArray()));
        System.out.println("SORTED SQUARES:\n" + Arrays.toString(returnSortedSquares(input)));
    }

    private static int[] returnSortedSquares(int[] input){
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
