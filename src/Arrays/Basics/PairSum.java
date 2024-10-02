package Arrays.Basics;

import java.util.ArrayList;
import java.util.Arrays;

public class PairSum {
    static void pairSum(int[] arr, int total) {
        int[] pair = new int[2];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i + 1; j <arr.length ; j++) {
                int sum = arr[i];
                sum = sum + arr[j];
                if (sum == total) {
                    pair[0] = i;
                    pair[1] = j;
                    System.out.println(Arrays.toString(pair)); // printing the indexes of the pairSum
                    return;
                }
            }
        }
        pair[0]= -1;
        pair[1] = -1;
        System.out.println(Arrays.toString(pair));
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 1, 3, 4, 8, 4};
        int total = 14;
        pairSum(arr, total);
    }
}
