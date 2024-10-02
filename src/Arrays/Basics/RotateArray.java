package Arrays.Basics;

import java.util.Arrays;

public class RotateArray {
    static void rotateArray(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            arr2[i] = arr[arr.length - (i + 1)];
        }
        System.out.println(Arrays.toString(arr2));

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 8};
        rotateArray(arr);
    }
}
