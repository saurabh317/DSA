package Arrays;

import java.util.ArrayList;

public class FindMissingElement {
    static void findMissing (int[] arr, int arrayLength) {
        // approach :- we will iterate over the given array and will try to match with the arrayLength,
        // if none of the array elements matches to the arrayLength then add that arrayLength to the missingList
        // and with each iteration we'll decrease the value of arrayLength and loop will continue till arrLength != 0
        ArrayList<Integer> missingNumbers = new ArrayList<>();

        while(arrayLength != 0) {
            int flag = 0;
            for (int j : arr) {
                if (arrayLength == j) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) missingNumbers.add(arrayLength);
            arrayLength--;
        }

        System.out.println(missingNumbers);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int arrayLength = 8;
        findMissing(arr, arrayLength);
    }
}
