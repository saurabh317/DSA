package Patterns;

/* Pattern 3:- print the following pattern (inverted triangle)
          *
         **
        ***
       ****
      *****
 */

public class Pattern3 {
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
        pattern3(5);
    }
}
