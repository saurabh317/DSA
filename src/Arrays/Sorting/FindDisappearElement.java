package Arrays.Sorting;

/*Problem statement: - Given an array numbs of n integers where numbs[i] is in the range [1, n],
return an array of all the integers in the range [1, n] that do not appear in numbs..

Approach :- we will sort the elements to their respective position and check for which ever

Example 1:
  Input: numbs = [4,3,2,7,8,2,3,1]
  Output: [5,6]

Example 2:
  Input: numbs = [1,1]
  Output: [2]


Constraints:
  n == numbs.length
  1 <= n <= 105
  1 <= numbs[i] <= n
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearElement {
    public static List<Integer> findDisappearedAndDuplicateNumbers(int[] array) {
        List<Integer> result = new ArrayList<>();
        int n = array.length;
        int i = 0;
        while (i < n) {
            int value = array[i];
            if (value != i + 1 && value != array[value -1]) {
                // before swapping make sure that the no. we are swapping are not same so above check will make sure
                //swap it to its correct index
                int temp;
                temp = array[i];
                array[i] = array[value - 1];
                array[value - 1] = temp;
            } else {
                i++;
            }
        }
        int [] duplicates = new int[1];

        for (int j = 0; j < n ; j++) {
            if (array[j] != j+1) {
                result.add(j+1);
                duplicates = new int[]{array[j]};
            }

        }

        System.out.println(Arrays.toString(duplicates));

        return result;
    }
    public static void main(String[] args) {
        int[] array = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedAndDuplicateNumbers(array));

    }
}
