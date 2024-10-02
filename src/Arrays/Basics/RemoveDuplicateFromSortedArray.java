package Arrays;

import java.util.ArrayList;

public class RemoveDuplicateFromSortedArray {

    static ArrayList<Integer> removeDuplicate(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<>();
        newArr.add(arr[0]);
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] != arr[i - 1]) {
                newArr.add(arr[i]);
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 6, 6, 7};
        ArrayList<Integer> result = removeDuplicate(arr);
        System.out.println(result);
    }
}
