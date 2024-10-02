package Arrays.Basics;

public class LargestElement {
    static int findLargestElement(int[] arr){
        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 1, 8};
        int max = findLargestElement(arr);
        System.out.println("maximum element of the array is : " +max);
    }
}
