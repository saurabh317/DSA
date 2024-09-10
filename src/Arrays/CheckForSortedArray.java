package Arrays;

public class CheckForSortedArray {
    static void isArraySorted(int[] arr){
        boolean isSorted = true;

        // here we have to check for both ascending and descending order
        boolean descendingOrderCheck = arr[0] > arr[1];

        for (int i = 0; i < arr.length; i++) {
            // if checking for descending order
            if (descendingOrderCheck && arr[i] < arr[i + 1]) {
                isSorted = false;
                break;
            } else if(!descendingOrderCheck && arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }

        }

        System.out.println(isSorted);

    }

    public static void main(String[] args) {
        int[] arr = {9, 6, 5, 4, 10};
        isArraySorted(arr);
    }
}
