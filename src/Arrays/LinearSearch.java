package Arrays;

public class LinearSearch {
    static void searchKey(int[] arr, int key) {
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == key) {
                System.out.println("key found at pos: " +i);
                return;
            }
        }
        System.out.println("key not found");

    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 9, 4, 0};
        searchKey(arr, 41);
    }
}
