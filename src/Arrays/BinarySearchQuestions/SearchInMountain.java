package Arrays.BinarySearchQuestions;

import java.util.Objects;

public class SearchInMountain {
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

    public static int findPeakElement (int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = (start + end)/2;
            if (arr[mid] < arr[mid + 1]) {
                // ascending order array so the largest element may lie on the right side
                start = mid + 1;

            } else if (arr[mid] > arr[mid + 1]) {
                // descending order array so the largest element may lie on the left side
                end = mid;
            }
        }

        return start;
    }

    public static int searchInArray (int[] arr, int target) {
        // first find the peak element and divide the array into two halves
        int peakElement = findPeakElement(arr); //4 arr1 = 0 - 4 , arr2 = 4 - arr.length - 1

        // first try to find the element in the first half of the array
        int output = search(arr, target, 0,  peakElement, "ascending");

        // if not found in the first half of the array then try to find in the second half of the array
        if (output == -1) {
            int end = arr.length - 1;
            int start = peakElement + 1;
            output = search(arr, target, start, end, "descending");
        }

        return output;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 5, 4};
        System.out.println(searchInArray(arr, 4));
    }
}
