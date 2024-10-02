package Arrays.Basics;

import java.util.ArrayList;

public class FindUnion {
    static void findUnion (int[] arr1, int[] arr2) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j <arr2.length ; j++) {
                if(arr1[i] == arr2[j]){
                    temp.add(arr1[i]);
                }
            }
        }

        System.out.println(temp);

    }
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 6, 9, 10, 18}; // 5, 6, 10
        int[] arr2 = {5, 6, 10, 81, 91};
        findUnion(arr1, arr2);
    }
}
