package sort;

/**
 *
 * Bubble Sort Theory
 *
 * The idea behind bubble sort is to arrange the array we are sorting to both unsorted and sorted partition indexes.
 *
 * We begin by traversing the array at index 0 and sort the array from left to right using a sliding window of values.
 * During this process we begin swapping the values so the result of the array ends up from smallest to biggest.
 * Once our index reaches the value of the length of the array we iterate again instead terminating the operation at the next offset from the final address of the array.
 * The effect this operation has is sorting the array from its smallest to largest values until the terminus offset is equal to the first offset of the array.
 * This is dubbed a bubble sort since we "bubble up" the larger elements to the array.
 *
 * The performance of the algorithm is equal to the number of the items in the array squared.
 * The assumed worse case is the array is ordered largest to smallest.
 * In this case we need to iterate twice for every item in the array to sort it.
 * We need to iterate once for the length of the array * 1 for the first operation, and then again for the second operation i.e. in the case the array size is 2.
 * */
public class BubbleSort {

    public static int[] bubbleSort(int[] arr){
        return recursiveSort(arr, 0, arr.length-1);
    }

    private static int[] recursiveSort(int[] arr, int index, int offset) {
        // Cases where the bubble sort is completed.
        if (offset <= 0) return arr;
        // Case where the index has met the offset.
        // Reset the index, decrease the offset by 1, and recall the function.
        if (index == offset) return recursiveSort(arr, 0, offset - 1);
        // Return a new array performing a swap at specified index for the current offset, pass that to the next iteration of the statement .
        if (arr[index + 1] < arr[index]) return recursiveSort(swap(arr, index, index + 1), index + 1, offset);
        return recursiveSort(arr, index+1, offset);
    }

    /**
     * Swaps the values of i and j at arr.
     */
    private static int[] swap(int[] arr, int i, int j){
        if (i == j){
            return arr;
        }
        int store = arr[i];
        arr[i] = arr[j];
        arr[j] = store;
        return arr;
    }
}
