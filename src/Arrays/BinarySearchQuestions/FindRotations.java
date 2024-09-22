package Arrays.BinarySearchQuestions;

import java.util.Objects;

public class FindRotations {
    public static int findRotationCount (int[] arr, String order) {
        int rotationCount = 0;
        for (int j : arr) {
            if (Objects.equals(order, "ascending") && j >= arr[arr.length - 1]) {
                rotationCount++;
            } else if (!Objects.equals(order, "ascending") && j <= arr[arr.length - 1]) {
                rotationCount++;
            } else {
                break;
            }
        }
        return rotationCount;
    }

    // also index of the pivot + 1 determines the total no. of rotations
    public static int findPivotIndex (int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end)/2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid -1;
            }
            if (arr[start] < arr[mid]) {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr =  {3,4,5,6,1,2}; //{3,4,5,6, 7, 8, 1,2}; //  {5, 3, 1, 9, 8, 7}
        String order = "ascending";
        int totalRotations = findPivotIndex(arr);
        System.out.println(totalRotations + 1);
        System.out.println(findRotationCount(arr, order));
    }
}
