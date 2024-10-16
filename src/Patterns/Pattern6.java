package Patterns;
/* Pattern 2:- print the following pattern (triangle)
     *
     **
     ***
     ****
     *****
     ****
     ***
     **
     *
*/

/* Note: - this is the formula we have to create
5 - 1 = 4
6 - 3 = 3
7 - 5 = 2
8 - 7 = 1
*/

public class Pattern6 {
    public static void pattern6(int length) {
        int counter = 1;

        for (int i = 0; i < (length * 2) - 1 ; i++) {
            int col = i+1;
            if (i >= length) {
                col = i - (2*counter - 1);
                counter ++;
            }
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern6(8);
    }
}
