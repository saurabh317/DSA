package Arrays.Basics;

public class MaxConsecutive {
    static int maxConsecutive(int[] arr) {
        int counter = 0;
        int preservedCounter = 0;

        for (int j : arr) {

            if (j == 1) {
                counter++;
                // update the value previous value only if the current strix(no. of consecutive ones) is greater than previous one
                if (preservedCounter == 0 || preservedCounter < counter) {
                    preservedCounter = counter;
                }
            } else {
                counter = 0;
            }

        }

        return preservedCounter;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 0, 1, 1, 1, 0};
        int max = maxConsecutive(arr);
        System.out.println(max);
    }
}
