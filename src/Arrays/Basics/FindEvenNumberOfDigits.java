package Arrays.Basics;

public class FindEvenNumberOfDigits {
    static void countEvenDigits(int[] arr) {
        int counter = 0;
        for (int j : arr) {
            int digitCounter = 0;

            if (j < 0) {//  in case the given element is negative number
                j = j * -1;
            }

            while(j > 0) { // checking the no. of digits of a given element of the array
                j = j/10;
                digitCounter++;
            }

            if (digitCounter % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }


    public static void main(String[] args) {
        int[] arr = {12, 234, -45, 124};
        countEvenDigits(arr);
    }
}
