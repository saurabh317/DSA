package Arrays;

public class CalculateMaxSum {
    static void sum (int[][] arr) {
        int maxsum = 0;
        int accIndex = 0;
        for (int row = 0; row < arr.length; row++) {
            int colSum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                colSum = colSum + arr[row][col];
            }
            if (colSum > maxsum) {
                accIndex = row;
                maxsum = colSum;
            }
        }
        System.out.println("account no. at " + accIndex + " has the max balance i.e: " + maxsum);

    }

    public static void main(String[] args) {
        int[][]  arr = {{1, 2,4}, {2, 1, 3}, {1, 5, 6}};
        sum(arr);
    }
}
