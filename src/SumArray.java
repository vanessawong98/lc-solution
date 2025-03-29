/**
 * Sum of 1D Array
 * <p>
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * <p>
 * Return the running sum of nums.
 * <a href="https://leetcode.com/problems/running-sum-of-1d-array/description/">Click here</a>
 */
public class SumArray {
    public static int[] runningSum(int[] nums) {

        /**
         * Input: nums = [1,2,3,4]
         * Output: [1,3,6,10]
         * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
         */

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        return prefix;
    }
}
