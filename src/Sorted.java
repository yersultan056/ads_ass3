import sorts.*;

public class Sorted {
    public static void main(String[] args) {
        sorted();
    }

    private static void sorted() {
        int testLen = 1000000;

        int[] arr = new int[testLen];

        System.out.println("\nSorted Array");

        for (int i = 0; i < testLen; i++) {
            arr[i] = (int)Math.round(Math.random() * 10000);
        }

        Quick.quickSort(arr, 0, testLen - 1);

        System.out.println("Quick sort:");
        measureTime(() -> Quick.quickSort(arr, 0, testLen - 1));

        System.out.println("Merge Sort:");
        measureTime(() -> Merge.mergeSort(arr));

        System.out.println("Heap Sort:");
        measureTime(() -> Heap.heapSort(arr));

        System.out.println("Insertion Sort:");
        measureTime(() -> Insertion.insertionSort(arr));

        System.out.println("Selection Sort:");
        measureTime(() -> Selection.selectionSort(arr));
    }

    private static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("Time spent: " + elapsed + " ms");
    }
}
