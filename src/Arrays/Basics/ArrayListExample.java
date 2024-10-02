package Arrays.Basics;

import java.util.ArrayList;
import java.util.Scanner;

// ArrayList is dynamic but internally its size is also fixed.
// if the existing ArrayList fills by 50% then it automatically creates a new ArrayList of 2x size of the
// previous one and copies all the elements to the new ArrayList and delete the old one.

public class ArrayListExample {// it is used to implement a dynamic array with no given size
    // syntax
    // ArrayList<dataType> variable_name = new ArrayList<dataType>()
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(9);
        // System.out.println(list);
        // for getting  the element of a particular index we need to call get function
        // will not work as we used to get item at a particular index in array
        // System.out.println(list.get(1));

        // creating a multidimensional ArrayList
        ArrayList<ArrayList<Integer>>  multiList = new ArrayList<>();

        // initialization
        for (int i = 0; i <3 ; i++) {
            multiList.add(new ArrayList<>());
        }

        // take input inside a multidimensional array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                multiList.get(i).add(sc.nextInt());
            }
        }
        System.out.println(multiList);
    }
}
