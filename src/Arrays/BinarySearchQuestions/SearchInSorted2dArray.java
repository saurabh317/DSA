package Arrays.BinarySearchQuestions;

import java.util.Arrays;

public class SearchInSorted2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println(Arrays.toString(search(arr, 7)));
    }

    public static int[] binarySearch(int[][] arr, int row, int colStart, int colEnd, int target) {
        while(colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart)/2;
            if(arr[row][mid] == target) {
                return new int[] {row, mid};
            }
            if (arr[row][mid] < target) {
                colStart = mid + 1;

            } else {
                colEnd = mid -1;
            }
        }
        return new int[] {-1, -1};
    }

    public static int[] search(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length; // be cautious arr can be empty

        if (rows == 1) {
            return binarySearch(arr, 0, 0, cols - 1, target);
        }

        // eliminate all the rows till we are remaining with only two rows
        int rowStart = 0;
        int rowEnd = rows - 1;
        int cMid = cols/2;

        while (rowStart < rowEnd - 1) { // while this is true we have more than 2 rows
            int rMid = rowStart + (rowEnd - rowStart)/2;
            if (arr[rMid][cMid] == target) {
                return new int[] {rMid, cMid};
            }
            if (arr[rMid][cMid] < target) {
                // ignore the above rows
                rowStart = rMid;
            } else {
                // ignore the bottom rows
                rowEnd = rMid;
            }
        }

        // now we have only two rows
        // check whether the target is in the col of 2 rows
        if (arr[rowStart][cMid] == target) {
            return new int[] {rowStart, cMid};
        }

        if (arr[rowStart + 1][cMid] == target) {
            return new int[] {rowStart + 1, cMid};
        }

        // if still we have not found the target we will divide the remaining arr, into four parts
        // search in the first half
        if (target <= arr[rowStart][cMid - 1]) {
            return binarySearch(arr, rowStart, 0, cMid - 1, target);
        }

        // search in the second half
        if (target >= arr[rowStart][cMid + 1] && target <= arr[rowStart][cols - 1]) {
            return binarySearch(arr, rowStart, cMid + 1, cols - 1, target);

        }
        // search in the third half
        if (target <= arr[rowStart + 1][cMid - 1]) {
            return binarySearch(arr, rowStart + 1, 0, cMid - 1, target);

        } else { // search in the forth half
            return binarySearch(arr, rowStart + 1,  cMid + 1, cols - 1, target);

        }

    }
}
