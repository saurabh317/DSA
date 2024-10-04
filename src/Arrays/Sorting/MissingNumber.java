package Arrays.Sorting;

/* Problem statement: find the missing no. in a given array (0,n)
input: [3, 1, 0]
output: 2 is the missing no.

Approach:- first we have to find the value of n (largest no. in array), after that we will sort the array through cycle sort
then we will try to match element with their respective index, and whichever element is not at their respective index ,that's our ans.
*/

import java.util.Arrays;

public class MissingNumber {
    public static int findMissingNumber (int[] arr) {
        // first find the n in the array i.e. the largest number in the array
        int n = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > n) {
                n = arr[i];
            }
        }

        // after finding the n , now place all the elements to their correct place
        int i = 0;
        while (i < arr.length) {
            int value = arr[i];
            if (i != value) {
                // swap it with its correct index
                if (value > arr.length - 1) { // if correct index of an element not found skip that
                    i++;
                } else {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[value];
                    arr[value] = temp;
                }
            } else {
                i++;
            }
        }

        // now check if all the elements are at correct index and whichever element is not , return it (that's our ans)
        for (int j = 0; j <= n ; j++) { //{0, 1, 3}
            if(j != arr[j]) {
                return j;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 0, 2, 8, 9, 6, 4, 5};
        System.out.println(findMissingNumber(arr));
    }
}
