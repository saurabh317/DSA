package Arrays.Sorting;

import java.util.Arrays;

public class SelectionSort {
    // algorithm: first we will find the largest element in the array then we will swap it with the last element of the array
    // by doing this we are pushing the greatest element to the end , and again we will use the same approach for the remaining array
    public static int findMax (int[] arr, int start, int end) {
        int max = 0;
        for (int i = start; i < end ; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }

        return max;
    }

    public static void swap(int[] arr, int max, int end) {
        int temp = arr[max];
        arr[max] = arr[end];
        arr[end] = temp;
    }

    public static int[] sortArr(int[] arr) {
        int end = arr.length - 1;
        while (end > 0) {
            int max = findMax(arr,0, end);
            swap(arr, max, end);
            end--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 1, 2};
        System.out.println(Arrays.toString(sortArr(arr)));
    }
}
