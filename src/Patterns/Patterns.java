package Patterns;
/* Pattern 1:- print the following pattern (square)
      *****
      *****
      *****
      *****
      *****
 */

/* Pattern 2:- print the following pattern (triangle)
      *
      **
      ***
      ****
      *****
 */

/* Pattern 3:- print the following pattern (inverted triangle)
          *
         **
        ***
       ****
      *****
 */

public class Patterns {
    public static void pattern1(int length) {
        for (int i = 0; i < length ; i++) {
            for (int j = 0; j < length ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int length) {
        for (int i = 0; i <length ; i++) {
            for (int j = 0; j < i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int length) {
        for (int i = 0; i < length ; i++) {
            for (int j = 0; j < length ; j++) {
                if (j >= length - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("pattern 1");
        pattern1(5);
        System.out.println("pattern 2");
        pattern2(5);
        System.out.println("pattern 3");
        pattern3(5);
    }
}

