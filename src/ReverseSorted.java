import sorts.*;

public class ReverseSorted {
    public static void main(String[] args) {
        reverse();
    }

    private static void reverse() {
        int testLen = 1000000;

        int[] arr1 = new int[testLen];
        int[] arr2 = new int[testLen];
        int[] arr3 = new int[testLen];
        int[] arr4 = new int[testLen];
        int[] arr5 = new int[testLen];

        System.out.println("\nReverse-sorted Array");

        for (int i = 0; i < testLen; i++) {
            arr1[i] = (int)Math.round(Math.random() * 10000);
        }
        Quick.quickSort(arr1, 0, testLen - 1);

        reverseArray(arr1);

        for (int i = 0; i < testLen; i++) {
            arr5[i] = arr4[i] = arr3[i] = arr2[i] = arr1[i];
        }

        System.out.println("Quick sort:");
        measureTime(() -> Quick.quickSort(arr1, 0, testLen - 1));

        System.out.println("Merge Sort:");
        measureTime(() -> Merge.mergeSort(arr2));

        System.out.println("Heap Sort:");
        measureTime(() -> Heap.heapSort(arr3));

        System.out.println("Insertion Sort:");
        measureTime(() -> Insertion.insertionSort(arr4));

        System.out.println("Selection Sort:");
        measureTime(() -> Selection.selectionSort(arr5));
    }

    private static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("Time spent: " + elapsed + " ms");
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
