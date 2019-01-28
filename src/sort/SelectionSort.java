package sort;

/**
 * Selection sort is called selection sort because for each traversal of the array we are selecting the largest element and moving it to the end of the partition if it is the greatest element in the array.
 * Selection sort is an in-place algorithm, it doesn't use any extra memory. So as long as the amount of extra memory you are using is constant by the number of items you are sorting, it is an in-place algorithm.
 * It is a quadratic algorithm, O(n^2), because we have n elements in the array, and for each element we traverse _n_ elements.
 * It is an unstable algorithm unlike bubble sort, if we have duplicate elements there is no guarantee that their original order relative to each other will be preserved throughout the entire lifespan of the operation, i.e. the array (10,10,4) may move the first 10 ahead of the second 10 (unlike bubble sort which preserves this meaningful order).
 */
public class SelectionSort {

    // Traverse the array and look for the largest element in the unsorted partition.
    public static int[] selectionSort(int[] arr) {
        // Set an offset of the last unsorted index at the end of the array,  which we will use as a partition of sorted information.
        for (int lastUnsortedIndex = arr.length - 1; 0 < lastUnsortedIndex; lastUnsortedIndex--) {
            int greatestValueIndex = lastUnsortedIndex;
            // Traverse each element of the array for its greatest value (so selecting the greatest value within the array) and swap the value to the end of the arrays partition if it is the greatest value.
            // We initialise the greatest value as the last unsorted index, so assuming it is the greatest value in the already. If there are no greater values the last unsorted element and greatest value element will remain equal.
            for (int currentValueIndex = 0; currentValueIndex < lastUnsortedIndex; currentValueIndex++) {
                if (arr[greatestValueIndex] < arr[currentValueIndex]) {
                    greatestValueIndex = currentValueIndex;
                }
            }
            // Micro optimisation, sort only if the elements differ in value.
            if (greatestValueIndex != lastUnsortedIndex) {
                int storeLastUnsortedValue = arr[lastUnsortedIndex];
                arr[lastUnsortedIndex] = arr[greatestValueIndex];
                arr[greatestValueIndex] = storeLastUnsortedValue;
            }
        }
        return arr;
    }
}
