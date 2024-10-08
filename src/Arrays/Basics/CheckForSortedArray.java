package Arrays.Basics;

public class CheckForSortedArray {
    static void isArraySorted(int[] arr){
        boolean isSorted = true;
        boolean descendingOrderCheck = arr[0] > arr[1];
        // here we have to check for both ascending and descending order

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                // if checking for descending order
                if (descendingOrderCheck && arr[i] < arr[j]){
                    isSorted = false;
                    break;
                } else if(!descendingOrderCheck && arr[i] > arr[j]) {
                    isSorted = false;
                    break;
                }
            }
        }

        System.out.println(isSorted);

    }

    public static void main(String[] args) {
        int[] arr = {9, 6, 5, 4, 10};
        isArraySorted(arr);
    }
}
