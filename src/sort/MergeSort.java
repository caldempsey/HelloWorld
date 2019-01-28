package sort;

import java.util.Arrays;

/**
 * Merge Sort
 * <p>
 * Merge sort is a divide and conquer algorithm where the array in question is split into a number of smaller arrays.
 * It is usually written using recursion, and involves two phases, splitting and merging.
 * <p>
 * We do the sorting during the merging phase. The splitting phase is a preparation phase to make sorting faster during the merging phase.
 * Splitting is logical. During the splitting we're not actually creating new array instances.
 */
public class MergeSort {
    /**
     * Splits the array specified as the first parameter of the method. Writes each element in single file to a set of methods within arrays.
     */
    public static int[] sort(int[] arr) {
        // Case where the source array is not sufficiently split, recursive splitting.
        if (arr.length == 1) {
            return arr;
        }
        // Case where the source array has been sufficiently split.
        int[][] splitArr = split(arr);
        // Recursive splitting for both parts of the array (from splitArrs[0], and splitArrs[2]).
        // This should "fan out" calls to the merge method since the merge method is invoked only when the arrays are sufficiently split.
        return merge(sort(splitArr[0]), sort(splitArr[1]));
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        // Counters for merging.
        int arr1Index = 0;
        int arr2Index = 0;
        // Array initialisation.
        int[] mergedArray = new int[arr1.length + arr2.length];
        // Merging process: decrement counters for each array conditional on relative size.
        for (int i = 0; i < mergedArray.length; i++) {
            if ((arr1Index > arr1.length-1)) { // If we have added all of the elements of array 1.
                mergedArray[i] = arr2[arr2Index];
                arr2Index++;
            } else if (arr2Index > arr2.length-1) { // If we have added all of the elements of array 2.
                mergedArray[i] = arr1[arr1Index];
                arr1Index++;
            } else if (arr1[arr1Index] <= arr2[arr2Index]) { // If the value at the index of arr1 is smaller than the value of the index of arr2, or equal to the value.
                mergedArray[i] = arr1[arr1Index];
                arr1Index++;
            } else if (arr1[arr1Index] > arr2[arr2Index]) { // If the value at the index of arr2 is greater than the value of the index of arr1.
                mergedArray[i] = arr2[arr2Index];
                arr2Index++;
            }
        }
        return mergedArray;
    }

    private static int[][] split(int[] source) {
        int[][] indices = new int[2][];
        int midpoint = (source.length) / 2;
        int[] left = Arrays.copyOfRange(source, 0, midpoint);
        int[] right = Arrays.copyOfRange(source, midpoint, source.length);
        indices[0] = left;
        indices[1] = right;
        return indices;
    }
}
