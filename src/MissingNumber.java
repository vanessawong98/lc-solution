import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Missing Number
 * <p>
 *      Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 * </p>
 *  <a href="https://leetcode.com/problems/missing-number/description/">Click here</a>
 */
public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        int largestNum = nums.length;

        for (int i = 0; i < largestNum; i++) {
            if (sortedNums[i] != i) {
                return i;
            }
        }

        return largestNum;
    }
}
