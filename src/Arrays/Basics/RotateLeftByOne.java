package Arrays.Basics;

import java.util.Arrays;

public class RotateLeftByOne {
    static void rotateLeftByOne(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length - 1 ; i++) {
            arr2[i] = arr[i + 1];
        }
        arr2[arr.length - 1] = arr[0];
        System.out.println(Arrays.toString(arr2));

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 8};
        rotateLeftByOne(arr);
    }
}

