package Day_2.Methods;

import java.util.Arrays;

public class ArrayUtilities {
    public static int secondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int[] mergeArrays(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        System.arraycopy(a, 0, merged, 0, a.length);
        System.arraycopy(b, 0, merged, a.length, b.length);
        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 1, 2, 5, 3, 4, 2};
        int[] arr2 = {7, 8, 9};

        System.out.println("Second largest: " + secondLargest(arr1));

        System.out.println("Remove duplicates: " + Arrays.toString(removeDuplicates(arr1)));

        bubbleSort(arr1);
        System.out.println("Bubble sorted: " + Arrays.toString(arr1));

        int[] merged = mergeArrays(arr1, arr2);
        System.out.println("Merged arrays: " + Arrays.toString(merged));
    }
}
