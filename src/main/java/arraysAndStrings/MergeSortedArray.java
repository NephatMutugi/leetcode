package arraysAndStrings;

/**
 * @Author Nephat Muchiri
 * Date 25/04/2023
 */
public class MergeSortedArray {

    public static int[] mergeSortedArray(int[] arr1, int[] arr2){
        // Given to sorted arrays, merge them into a single array

        // merged array len = arr1 + arr2
        int[] mergedArr = new int[arr1.length + arr2.length];
        // initialize 3 counters, i for arr1, j for arr2, k for merged array
        int i = 0, j = 0, k =0;

        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                mergedArr[k] = arr1[i];
                i++;
            } else {
                mergedArr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length){
            mergedArr[k++] = arr1[i++];
        }
        while (j < arr2.length){
            mergedArr[k++] = arr2[j++];
        }

        return mergedArr;
    }

}
