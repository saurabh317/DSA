//write a java program to detect a given character is capital or small, for capital return 1 and for small return 0
// A to Z (65 - 90) a to z (97-122)
package Basics;

import java.util.Scanner;

public class Character {
    public static void main(String [] args) {
        System.out.println("enter a character to check");
        Scanner sc = new Scanner(System.in);
        char value = sc.next().charAt(0);
        if ((int)value >= 65 && (int)value <=90) {
            System.out.println(1);
        } else if ((int)value >= 97 && (int)value <=122){
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }
}