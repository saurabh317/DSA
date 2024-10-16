package Patterns;

/* Pattern 2:- print the following pattern (triangle)
          *
         * *
        * * *
       * * * *
        * * *
         * *
          *
*/

public class Pattern7 {
    public static void pattern7(int n) {
        for (int i = 0; i < 2*n  ; i++) {
            int col = (i >= n) ? 2*n - i : i + 1;

            int spaces = n - col;
            for (int j = 0; j < spaces ; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < col ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        pattern7(4);
    }
}
