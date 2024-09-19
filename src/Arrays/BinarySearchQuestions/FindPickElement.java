package Arrays.BinarySearchQuestions;

public class FindPickElement {
    public static void findPickElement (int[] arr) {
        int start = 0;
        int end = arr.length - 1;

       // in each partition we are actually verifying whether we are in decreasing part or increasing part of the array
       // if decreasing then the greater element will possibly lie towards the left side and vice versa
        while(start < end) {
            int mid = (start + end)/2;
            if (arr[mid] > arr[mid + 1]) {
                // we are in decreasing part of the array and arr[mid] can be the potential output but still we will check towards its left side
                end = mid;
            } else {
                // we are in the increasing part of the array so we will further check to its right
                start = mid + 1;
            }
        }

        System.out.println(arr[start]);

    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 5, 4};
        findPickElement(arr);

    }
}

