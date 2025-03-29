import java.util.Arrays;

/**
 * Given an array of integers nums, you start with an initial positive value startValue.
 * <p>
 * In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).
 * <p>
 * Return the minimum positive value of startValue such that the step by step sum is never less than 1.
 * <p>
 *
 * <a href="https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/description/">Click here</a>
 */
public class MinPositiveSum {
    public static int minStartValue(int[] nums) {

        int[] prefix = new int[nums.length];
        int minSum = 0;

        for (int i = 0; i < nums.length; i++){
            if (i == 0) {
                prefix[0] = nums[0];
                minSum = Math.min(prefix[i], minSum);
                continue;
            }
            prefix[i] = prefix[i-1] + nums[i];
            minSum = Math.min(prefix[i], minSum);
        }

        return 1 - minSum;
    }
}
