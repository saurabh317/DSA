package Arrays.Basics;

import java.util.Arrays;

public class SearchIn2DArray {
    static void search(int[][] arr, int target) {
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    int[] result = new int[]{row, col};
                    System.out.println("element found at index : " +Arrays.toString(result));
                    return;
                }
            }
        }
        System.out.println("element doesn't exits");

    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 4},
                {4, 6, 9},
                {12, 56, 34}
        };
        search(arr, 56);
    }
}
