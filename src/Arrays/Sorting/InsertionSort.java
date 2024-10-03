package Arrays.Sorting;

// Problem Statement : Implement the Bubble Sort algorithm to sort an array of integers in ascending order.

/* Approach: with each iteration we have to insert the next element to its appropriate position in the array
i = 0 (iteration) in this iteration we will place the arr[i+1] element to its sorted position in the array
i = 1 (iteration) in this iteration we will place the arr[i+1] element to its sorted position in the array
so on by doing this in every iteration basically we are sorting the array till (i+1)
*/

import java.util.Arrays;

public class InsertionSort {
    public static void insertElement(int[] arr, int i) {
        // we need to place arr[i+1] in such a way that arr[i] < arr[i+1] && arr[i+1] < arr[i+2]

        for (int j = i + 1; j > 0 ; j--) {
            if (arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            } else {
                break;
            }
        }
    }

    public static int[] sortArr (int[] arr) {
        int iterations = arr.length - 1;

        for (int i = 0; i < iterations ; i++) {
            // need to insert i+1 element to its sorted position
            insertElement(arr, i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 16, 9, 17, 23, 21, 20};
        System.out.println(Arrays.toString(sortArr(arr)));
    }
}
