// Input Format: N = 3, k = 5, array[] = {2,3,5}
// Result: {2,3}
package Arrays;
import java.util.ArrayList;

public class LongestSubArraySum {
    // approach:- we are going to store two consecutive subArrays in two ArrayLists, and then we will dissolve one of them based on their length and
    // hence again we will be able to store another subArray and at last based on the length of both the Arraylists we can return the longest subArray.

    static void longestSubArraySum(int[] arr, int totalSum) {
        int index = 0; // this will store the index from where we have exit the loop after finding a subArray whose sum is = totalSum
        int flag = 0;  // value of flag will determine that in which array we are storing our subArray (newArr1 or newArr2)
        ArrayList<Integer> newArr1 = new ArrayList<>();
        ArrayList<Integer> newArr2 = new ArrayList<>();

        while (index < arr.length) { // this outer loop will continue till we cover each element in the array.
            int sum = 0;
            
            for (int i = index; i < arr.length; i++) {
                sum = sum + arr[i];
                if (flag == 0) { // based on the flag we will store the subArray
                    newArr1.add(arr[i]);
                } else {
                    newArr2.add(arr[i]);
                }
                
                if(sum == totalSum){ // exit the loop if a subArray is found
                    index = i+1;
                    flag++;
                    break;
                }
            }

            // once we have two subArrays , we will reset the smallest subArray, and again we will store another subArray at its place.
            int firstArrLength = newArr1.size(); // reset the smallest subArray and clear all its elements, so that again we can store one subArray
            int secondArrLength = newArr2.size(); // and again we will reset the smallest subArray among those two, subArray
            if (firstArrLength > secondArrLength) {
                newArr2.clear();
            } else { // if resetting the first array then make the flag = 0, so that the new subArray can be stored in first array
                newArr1.clear();
                flag = 0;

           }
        }

        // by doing this we will be left with just two subArrays at last, and we'll return the longest one
        int firstArrLength = newArr1.size();
        int secondArrLength = newArr2.size();
        if (firstArrLength > secondArrLength) {
            System.out.println(newArr1);
        } else {
            System.out.println(newArr2);
        }
    }

    public static void main(String[] args) {
    int[] arr ={1,9,2,3,5,1,1,1,1,6};
        int sum = 10;
        longestSubArraySum(arr, sum);
    }
}
