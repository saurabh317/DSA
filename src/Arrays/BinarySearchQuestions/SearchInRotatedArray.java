package Arrays.BinarySearchQuestions;

import java.util.Arrays;
import java.util.Objects;

public class SearchInRotatedArray {

    static int findPivotPointWithDuplicates (int[] arr, boolean ascending) {
        int index = -1;
        // in case of the ascending order sorted array pivot will be the largest element in the array
        // in case of the descending order sorted array pivot will be the smallest number in the array
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end)/2;
            // handle all the 4 cases here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // if start , mid and end are the duplicates then we'll skip those values
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                // Note :- what if the elements that we are skipping is the pivot , so let's confirm first then skip
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (arr[end - 1] > arr[end]) {
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;

    }

    static int findPivotPoint (int[] arr, boolean ascending) {
        int index = -1;
        // in case of the ascending order sorted array pivot will be the largest element in the array
        // in case of the descending order sorted array pivot will be the smallest number in the array
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end)/2;
            // handle all the 4 cases here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            }
            if (arr[mid] > arr[start]) {
                start = mid + 1;
            }

        }
        return -1;

    }

    static int search (int [] arr, int target, int start, int end, String order) {

        while (start <= end) {
            int mid = (start + end)/2;
            if ((arr[mid] > target && Objects.equals(order, "ascending")) || (arr[mid] < target && !Objects.equals(order, "ascending"))) {
                end = mid - 1;
            } else if ((arr[mid] < target && Objects.equals(order, "ascending")) || (arr[mid] > target && !Objects.equals(order, "ascending"))) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int searchInRotateArray (int[] arr, int target, boolean isDuplicates) {
        int indexOfTarget = -1;
        boolean ascending = arr[0] > arr[arr.length - 1]; // in case of the rotated array
        int pivot = -1;
        if (isDuplicates) {
            pivot = findPivotPointWithDuplicates(arr, ascending);
        } else {
            pivot = findPivotPoint(arr, ascending);
        }
        // based on pivot divide the array into two halves (0-pivot) and (pivot+1 - (arr.length - 1))
        indexOfTarget = search(arr, target, 0, pivot, "ascending");
        if (indexOfTarget == -1) {
            int start = pivot + 1;
            int end = arr.length - 1;
            indexOfTarget = search(arr, target, start, end, "ascending");
        }

        return indexOfTarget;
    }

    public static void main(String[] args) {
        int [] arr = {3,4,5,6,1,2}; //{6, 7, 8, 9, 10, 11, 2, 3, 4, 5}
        System.out.println(searchInRotateArray(arr, 2, false));
        boolean isDuplicates = true;
        int[] arr2 = {3, 4, 8, 9, 9, 9, 0, 2, 2};
        System.out.println(searchInRotateArray(arr2, 9, isDuplicates));
    }
}
