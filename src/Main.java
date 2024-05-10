import sorts.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] params) {
        int[] array = new int[] {15,78,89,9,12,12546,8,879,16,54,1};
        System.out.println(Arrays.toString(array));
        array = Merge.mergeSort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("-------------");

        int [] arr = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        System.out.println(Arrays.toString(arr));
        Quick.quickSort(arr, 0, array.length - 1);
        System.out.println(Arrays.toString(arr));

        System.out.println("-------------");

        int[] array3 = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        System.out.println(Arrays.toString(array3));
        Insertion.insertionSort(array3);
        System.out.println(Arrays.toString(array3));

        System.out.println("-------------");

        int[] array4 = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        System.out.println(Arrays.toString(array4));
        Selection.selectionSort(array4);
        System.out.println(Arrays.toString(array4));

        System.out.println("-------------");

        int[] array5 = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        System.out.println(Arrays.toString(array5));
        Heap.heapSort(array5);
        System.out.println(Arrays.toString(array5));
    }
}