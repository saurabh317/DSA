package Arrays.Sorting;
/* Problem statement: Given an array from 1-n sort it in ascending order with the timeComplexity o(n) i.e using one loop

Approach: As it is already know to us that given array is from 1-n so the correct index of each element inside array will
be element - 1, (correct index of 5 will be 4, index of 2 will be 1)
*/

import java.util.Arrays;

public class CycleSort {
    public static int[] sort(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            int value = arr[i];
            if ((i+1) != value) {
                // swap value to its actual position
                int temp;
                temp = arr[i];
                arr[i] = arr[value -1];
                arr[value-1] = temp;
            } else {
                i++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 3};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
