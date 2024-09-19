package Arrays.BinarySearchQuestions;

public class SearchNumberInInfiniteArray {
    public static void search (int[] arr, int target) {
        // approach :- we will search the target in chunks i.e increasing the size of the array exponentially
        int start = 0;
        int end = 1;

        while(target > arr[end]) { // we need to exponentially grow the arr only if the target is greater than the end
            start = end + 1; // coz for searching in the array the target should always lie between start and end
            end = 2 * start;
        }

        while (start <= end) {
            int mid = (start + end)/2;

            if(arr[mid] == target) {
                System.out.println(mid);
                return;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 9, 10, 12, 15, 23, 30, 32};
        search(arr, 3);
    }
}
