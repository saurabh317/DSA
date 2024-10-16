package Patterns;

/* Pattern 2:- print the following pattern (triangle)
     1
     12
     123
     1234
     12345
 */

public class Pattern5 {
    public static void pattern5(int length) {
        for (int i = 0; i <length ; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern5(5);

    }
}
