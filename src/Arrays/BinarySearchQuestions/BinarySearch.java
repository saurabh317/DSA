package Arrays.BinarySearchQuestions;

public class BinarySearch {
    static void binarySearch (int[] arr, int key) {

        int start = 0;
        int end = arr.length; //7

        while (start <= end) {
            int mid = start + (end - start)/2; //
            if (key < arr[mid]) {
                end = mid - 1; //2
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                System.out.println("element found at index : " +mid);
                return;
            }
        }
        System.out.println("element not found");

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 9, 10, 15, 67};
        binarySearch(arr, 1);
    }
}
