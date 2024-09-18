package Arrays;

import java.util.Arrays;

public class FindFirstAndLastOccurrences {
    static int search (int[] arr, int key, boolean findFirstOccurrence) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = (start + end)/2;
            if (arr[mid] == key) {
                result = mid;
                if (findFirstOccurrence) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }

    static int[] findOccurrences (int[] arr, int key) {
        int firstOccurrence = search(arr, key, true);
        int lastOccurrence = search(arr, key, false);

        return new int[]{firstOccurrence, lastOccurrence};
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 5, 7, 7, 7, 7, 8, 8, 9};
        int key = 8;
        System.out.println(Arrays.toString(findOccurrences(arr, key)));
    }
}
