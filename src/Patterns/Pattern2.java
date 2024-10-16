package Patterns;

/* Pattern 2:- print the following pattern (triangle)
      *
      **
      ***
      ****
      *****
*/

public class Pattern2 {
    public static void pattern2(int length) {
        for (int i = 0; i <length ; i++) {
            for (int j = 0; j < i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern2(5);
    }
}
