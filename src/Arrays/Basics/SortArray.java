package Arrays.Basics;

import java.util.Arrays;

public class SortArray { // we need to sort this array without using any sorting algorithm
    static void sortArray (int[] arr) {
        // approach:- if we will be able to count the no. of 0s, 1s and 2s , then it will be super easy to place this in array
        int counter0 = 0, counter1 = 0, counter2 = 0;
        for (int j : arr) { // by doing this now we are taking record of no, of 0s, 1s, 2s
            if (j == 0) counter0++;
            else if (j == 1) {
                counter1++;
            } else {
                counter2++;
            }
        }

        //now spread the no,s starting from 0
        for (int i = 0; i< counter0; i++) arr[i] = 0;
        for (int i = counter0; i< counter1; i++) arr[i] = 1;
        for (int i = counter1; i< counter2; i++) arr[i] = 2;

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 2, 2};
        sortArray(arr);
    }
}
