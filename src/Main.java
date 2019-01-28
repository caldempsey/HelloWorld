import challenges.CloudHopper;
import sort.BubbleSort;
import sort.InsertionSort;
import sort.MergeSort;
import sort.SelectionSort;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!\n");
        System.out.println("Recursive bubble sort...\n");
        int[] newArr = BubbleSort.bubbleSort(new int[]{1, 8, 3, 5, 7, 1});
        for (int i : newArr) {
            System.out.println(i);
        }
        System.out.println("Selection Sort\n");
        newArr = SelectionSort.selectionSort(new int[]{1, 8, 3, 5, 7, 1});
        for (int i : newArr) {
            System.out.println(i);
        }
        System.out.println("Insertion Sort\n");
        newArr = InsertionSort.sort(new int[]{1, 8, 3, 5, 7, 1});
        for (int i : newArr) {
            System.out.println(i);
        }
        System.out.println("Merge Sort\n");
        newArr = MergeSort.sort(new int[]{1, 8, 3, 5, 7, 1});
        for (int i : newArr) {
            System.out.println(i);
        }
        System.out.println("Jumping On Clouds\n");
        int[] clouds = {0, 0, 1, 0, 0, 1, 0};
        System.out.println(CloudHopper.clouds(clouds));
    }
}
