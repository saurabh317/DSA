package Patterns;
/* Pattern 1:- print the following pattern (square)
      *****
      *****
      *****
      *****
      *****
*/

public class Pattern1 {
    public static void pattern1(int length) {
        for (int i = 0; i < length ; i++) {
            for (int j = 0; j < length ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        System.out.println("pattern 1");
        pattern1(5);
    }
}

