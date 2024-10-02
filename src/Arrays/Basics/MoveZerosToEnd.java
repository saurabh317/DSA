package Arrays.Basics;

import java.util.Arrays;

public class MoveZerosToEnd {

    static void moveAllZerosToEnd(int[] arr){
        int arrLength = arr.length;
        int[] temp = new int[arrLength];
        int tempIndex = 0;
        for (int j : arr) {
            if (j != 0) {
                temp[tempIndex] = j;
                tempIndex++;
            }
        }
        // here in our case its zeros so even if we don't specify any elements in arr it will take 0 by default
        // if any other number is there , we will fill that no. to the remaining spots in the array
//        for (int i = 0; i < arrLength - tempIndex ; i++) {
//            temp[i + tempIndex] = 9;
//        }

        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 0, 4, 9, 8, 0, 9};
        moveAllZerosToEnd(arr);
    }
}
