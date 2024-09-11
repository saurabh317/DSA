package Arrays;

import java.util.Arrays;
import java.util.Objects;

public class RotateByKElement {
    static void rotateArray (int[] arr, int key, String side) {
        int[] tempArr = new int[arr.length];

        // if side is left we gonna split array from left i.e splitPoint = key
        int splitPoint = Objects.equals(side, "right") ? arr.length - key : key;
        int[] firstSplit = Arrays.copyOfRange(arr, 0, splitPoint);
        int[] secondSplit = Arrays.copyOfRange(arr, splitPoint, arr.length);

        for (int i = 0; i < secondSplit.length ; i++) {
            tempArr[i] = secondSplit[i];
        }

        for (int i = 0; i < firstSplit.length ; i++) {
            tempArr[secondSplit.length + i] = firstSplit[i];
        }

        System.out.println(Arrays.toString(tempArr));

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 4, 9};
        rotateArray(arr, 3, "left");
        rotateArray(arr, 2, "right");
        rotateArray(arr, 1, "left");
    }

    // second approach
//static String rotate(int[] arr, int k, String pos) {
//
//    if (pos.equals("right")) {
//        for (int i = 0; i < k; i++) {       //iterate k times
//            int temp = arr[arr.length - 1];
//            for (int j = arr.length - 1; j > 0; j--) {
//                arr[j] = arr[j - 1];        //shift array one position to the right in each iteration
//            }
//            arr[0] = temp;
//        }
//    } else if (pos.equals("left")){
//        for (int i = 0; i < k; i++) {       //iterate k times
//            int temp = arr[0];
//            for (int j = 0; j < arr.length - 1; j++) {
//                arr[j] = arr[j + 1];        //shift array one position to the left in each iteration
//            }
//            arr[arr.length - 1] = temp;
//        }
//    }
//
//    return Arrays.toString(arr);
//}
//
//    public static void main(String[] args) {
//        int[] arr = {2, 5, 3, 4, 7, 6};
//
//        System.out.println(rotate(arr, 3, "left"));
//
//    }


}
