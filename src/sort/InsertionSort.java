package sort;

public class InsertionSort {

    public static int[] sort(int[] arr) {
        // Create a partition of unsorted integers (which will consist of all integers that have yet to be sorted by the algoritm).
        // We can assume the first item of the array is sorted.
        // For each member `i` of the unsorted partition; iterate through the sorted partition from right to left seeking the smallest possible value such that `i` is smaller than that value.
        // Insert `i` to that member of the array.
        // The way the actual insertion step is achieved is by shifting the elements of the array.
        for (int unsortedPartitionIndex = 1; unsortedPartitionIndex < arr.length; unsortedPartitionIndex++) {
            // To shift the elements of the array. first acquire the first member of the unsorted partition, as we can assume the rest of the partition is in logical order.
            // For each member of the array beginning at the unsorted partitions index, set each member of arr[i] to arr i-1.
            // Continue this for each element until we find the right position for the element in the array.
            // The effect this will have is an implicit shift of the elements in the array, where the position at i-1 will always be copied up the array by one index.
            // So we are looking to shift members "until" we reach the element of the array smaller in size of the new element.
            // We don't need to worry about the last element in the array as this will represent the last element of the unsorted partition.
            // Once we have found the element such that it is smaller than the new element we wish to insert, we can use that index (i) as the index which we insert the new element.
            int newElement = arr[unsortedPartitionIndex];
            int i;
            for (i = unsortedPartitionIndex; i > 0 && arr[i - 1] > newElement; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = newElement;
        }
        return arr;
    }
}
