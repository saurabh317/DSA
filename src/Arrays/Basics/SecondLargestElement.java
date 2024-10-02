package Arrays.Basics;

public class SecondLargestElement {
    static int secondLargestElement(int[] arr) {
        int max1 = arr[0];
        int max2 = arr[0];
        for (int j : arr) {
            if (max1 < j) {
                max2 = max1;
                max1 = j;
            }
        }
        return max2;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr = new int[]{3, 1, 7, 9, 9};
        int secondLargestNum = secondLargestElement(arr);
        System.out.println(secondLargestNum);
    }
}
