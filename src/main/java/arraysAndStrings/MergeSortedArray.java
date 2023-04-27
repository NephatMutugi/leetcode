package arraysAndStrings;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Nephat Muchiri
 * Date 25/04/2023
 */
public class MergeSortedArray {

    public static List<Integer> mergeSortedArray(int[] arr1, int[] arr2){
        // Given to sorted arrays, merge them into a single array

        List<Integer> mergedArr = new ArrayList<>();
        // initialize 3 counters, i for arr1, j for arr2, k for merged array
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                mergedArr.add(arr1[i]);
                i++;
            } else {
                mergedArr.add(arr2[j]);
                j++;
            }
        }

        while (i < arr1.length){
            mergedArr.add(arr1[i]);
            i++;
        }
        while (j < arr2.length){
            mergedArr.add(arr2[j]);
            j++;
        }

        return mergedArr;
    }

}
