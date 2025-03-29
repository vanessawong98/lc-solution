/**
 * Maximum Average Subarray
 * <p>
 * You are given an integer array nums consisting of n elements, and an integer k.
 * <p>
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
 * <a href="https://leetcode.com/problems/maximum-average-subarray-i/description/">Click here</a>
 */
public class MaxAvgSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        double answer;

        int current = 0;

        //first window
        for (int i = 0; i < k; i++) {
            current += nums[i];
        }

        answer = (double) current / k;

        for (int i = k; i < nums.length; i++) {
            current += nums[i];
            current -= nums[i-k];
            answer = Math.max((double) current / k, answer);
        }

        return answer;
    }
}
