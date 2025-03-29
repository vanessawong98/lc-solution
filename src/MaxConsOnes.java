/**
 * Maximum Consecutive Ones III
 * <p>
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 * <p>
 * <a href="https://leetcode.com/problems/max-consecutive-ones-iii/description/">Click here
 * </a>
 */
public class MaxConsOnes {
    public static int longestOnes(int[] nums, int k) {
        int answer = 0;

        int left = 0;
        int right = 0;

        int flipped = 0;

        for (right = 0 ; right < nums.length;) {
            if (nums[right] == 1) {
                //If 1 is encountered, expand the window
                right++;
            } else {
                //num[i] = 0
                if (flipped == k) {
                    //right don't move / expand if flipped is equal to k
                    if (nums[left] == 0) {
                        //if left is a zero, we slide the window forward
                        left++;
                        right++;
                    } else {
                        //else we shrink the window
                        left++;
                    }
                } else {
                    //If haven't reached maximum flipped, expand the window while increasing flipped count
                    flipped++;
                    right++;
                }
            }
            //Always take the largest number as the answer at the end of each loop.
            answer = Math.max(right - left, answer);
        }

        return answer;
    }
}
