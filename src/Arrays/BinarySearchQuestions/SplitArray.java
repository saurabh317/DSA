package Arrays.BinarySearchQuestions;

public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(nums, k));
    }

    public static int splitArray(int[] nums, int k) {
        // start will contain the min sum of the sub array in any case
        // end will contain the total sum of the all values inside the array
        // so here we are creating a range of numbers, and  we'll search the potential answer in this range using BS

        int start = 0;
        int end = 0;

        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }
        while(start < end) {
            int mid = start + (end -start)/2;

            int sum = 0;
            int pieces = 1; // this contains the no, of sub arrays used in total

            for(int num : nums) {
                // if sum of the values inside a sub array is greater than the mid , we'll push the next element in the another sub array
                // and there the sum of the another sub Array will be the element itself
                if (sum + num > mid) {
                    // insert the nums into the another subArray

                    pieces++;
                    sum = num;
                } else {
                    sum += num;
                }
            }

            if (pieces > k) { // if the no. of subArray is greater than the one we were instructed to split we'll update the start
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;

    }
}
