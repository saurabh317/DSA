package Arrays;

public class MajorityElement {
    static void findMajority (int[] arr) {
        int half = arr.length/2;
        int counter = 0;
        for (int k : arr) {
            for (int i : arr) {
                if (k == i) {
                    counter++;
                }
            }
            if (counter >= half) {
                System.out.println(k);
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,4,2,4,3,4,4,3,2,4};
        findMajority(arr);

    }
}
