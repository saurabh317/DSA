package Arrays.BinarySearchQuestions;

public class CeilingOfANumber {
    static int findCeiling (int[] arr, int key) {

        // first we will find the order of sorting of the given array
        boolean ascendingOrder = arr[0] <= arr[arr.length - 1];

        // basically we have to find the no. = key or smallest no. greater than the key
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if ((mid == 0) || (arr[mid] > key && key > arr[mid - 1]) || (arr[mid] == key)) {
                // return the mid if mid is 0 coz if the key is even lesser than the arr[0] then arr[0] becomes its ceiling
                // and if arr[mid] > key that means that our possible output but to confirm we will check that weather the previous element is lesser then key
                return mid;
            } else if ((arr[mid] > key && ascendingOrder) || (arr[mid] < key && !ascendingOrder)) {
                end = mid - 1;
            } else if ((arr[mid] < key && ascendingOrder) || (arr[mid] > key && !ascendingOrder)) {
                start = mid + 1;
            }
        }

        return -1;
    }

    static int findFloor (int[] arr, int key) {
        int start = 0;
        int end = arr.length;
        boolean ascendingOrder = arr[0] <= arr[arr.length - 1];

        while(start <= end) {
            int mid = (start + end)/2;

            if ((mid == arr.length - 1) || (arr[mid] == key) || (arr[mid] < key && arr[mid+1] > key)) {
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
        int[] arr = {1, 4, 6, 9, 10, 13, 19}; // { 13, 11, 10, 4, 3, 1} {1, 4, 6, 9, 10, 13, 19} {'a', 'b', 'c', 'd', 'e'}
        int key = 0;
        int ceilingOfNo = findCeiling(arr, key);
        int floorOfNo = findFloor(arr, key);
        System.out.println("ceiling of the given key found at index: " +ceilingOfNo);
        System.out.println("floor of the given key found at index: " + floorOfNo);
    }
}
