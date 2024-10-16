package Patterns;

/* Pattern 2:- print the following pattern (triangle)
      ******
      *****
      ****
      ***
      **
      *

 */

public class Pattern4 {
    public static void pattern4(int length) {
        for (int i = 0; i < length ; i++) {
            for (int j = length - i; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern4(5);
    }
}
