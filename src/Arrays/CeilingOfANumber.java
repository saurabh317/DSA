package Arrays;

public class CeilingOfANumber {
    static int findCeiling (int[] arr, int key) {

        // first we will find the order of sorting of the given array
        boolean ascendingOrder = arr[0] <= arr[arr.length - 1];

        // basically we have to find the no. = key or smallest no. greater than the key
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (mid == 0) {
                return mid;
            } else if ((arr[mid] > key && key > arr[mid - 1]) || (arr[mid] == key)) {
                return mid;
            } else if ((arr[mid] > key && ascendingOrder) || (arr[mid] < key && !ascendingOrder)) {
                end = mid - 1;
            } else if ((arr[mid] < key && ascendingOrder) || (arr[mid] > key && !ascendingOrder)) {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {13, 11, 10, 4, 3, 1}; // { 13, 11, 10, 4, 3, 1} {1, 4, 6, 9, 10, 13, 19}
        int key = 12;
        int ceilingOfNo = findCeiling(arr, key);
        System.out.println("ceiling of the given key found at index: " +ceilingOfNo);
    }
}
