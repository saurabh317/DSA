package Basics;

import java.util.Scanner;

public class PrintInvertedTriangle {
    public static void main(String[] args) {
        System.out.println("enter a number for the depth of the triangle");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= rows; j++) {
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }

    }
}
