package Patterns;

/* Pattern 2:- print the following pattern (triangle)
             1
           2 1 2
         3 2 1 2 3
       4 3 2 1 2 3 4
     5 4 3 2 1 2 3 4 5
*/

public class Pattern8 {
    public static void pattern8(int n) {
        for(int row = 1; row <= n; row++) {
            int totalNoColPerRow = 2*row - 1;
            int space = n - row;

            for (int i = 0; i < space ; i++) {
                System.out.print("  ");
            }

            int printValue = row;

            for(int col = 1; col <= totalNoColPerRow; col++) {
                int halfCol = totalNoColPerRow/2;
                System.out.print(printValue+ " ");
                if (col > halfCol){
                    printValue++;
                } else {
                    printValue--;
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern8(5);
    }
}
