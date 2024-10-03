package Arrays.Sorting;

// Problem Statement : Implement the Bubble Sort algorithm to sort an array of integers in ascending order.

import java.util.Arrays;

public class BubbleSort { // bubble sort is often know as sinking or exchange sort
    public static int[] sortArr (int[] arr) {
        int loopCounter = arr.length - 1;
        boolean swaped = false;
        while (loopCounter > 0) {
            for (int i = 0; i < arr.length - 1 ; i++) {
                int temp;
                if(arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swaped = true;
                }
            }
            if (!swaped) break; // best case if in a particular iteration swap doesn't happen then it means that arr is sorted
            loopCounter--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        System.out.println((Arrays.toString(sortArr(arr))));
    }
}
