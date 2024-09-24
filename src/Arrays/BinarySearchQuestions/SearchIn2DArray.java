package Arrays.BinarySearchQuestions;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[] [] arr = {
                {5, 10, 15},
                {11, 12, 16},
                {20, 22, 25}
        };
        System.out.println(Arrays.toString(search(arr, 16)));
    }

    public static int[] search (int[][] arr, int target) {
        int row = 0;
        int col = arr.length -1;

        while (row < arr.length && col >= 0) {
            if(arr[row][col] == target) {
                return new int[] {row, col};
            }
            if (arr[row][col] > target) {
                col--;
            } else {
                row ++;
            }
        }

        return new int[] {-1, -1};
    }
}
