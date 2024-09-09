package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class Array {
    // syntax of initializing an array
    // dataType[] variable_name = new dataType[size];
    // int[] arr = new int[5];
    //// or directly
    // int[] arr1 = {5, 4, 8, 9, 0};

    // takeInput is the function which takes the input for the array from the user and fills it in the array
    public static int[] printArray(int n){
        int[] arr = new int[n];
        System.out.println("enter the elements of the array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

        System.out.println("below we goona print the array elements with foreach loop");

        for (int num : arr) {
            System.out.println(num);// this is the foreach loop in java
        }

        System.out.println("below we goona print the array elements using Arrays.toString()");
        System.out.println(Arrays.toString(arr));

        return arr;
    }

    public static int[][] takeInput2D(int n, int m) {
        int[][] arr2D = new int[n][m];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2D[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("print using array function");
        for (int i = 0; i < arr2D.length; i++) {
            System.out.println(Arrays.toString(arr2D[i]));
        }

        System.out.println("print using foreach loop");
        for(int[] a: arr2D){ // dataType variable_name : the array you want to itrate
            System.out.println(Arrays.toString(a));
        }

        return arr2D;

    }

    public static void main(String[] args) {
        int[] arr; // array declaration
        arr = new int[6]; // initialization of the array

        String[] nameArr= new String[5];
        // by default the string arr contains null and int arr contains 0 as the default value
        System.out.println(nameArr[0]);
//        int[] z = printArray(5);
        int[][] a = takeInput2D(3, 3);

    }
//
}
