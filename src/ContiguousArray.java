import java.util.HashMap;
import java.util.Map;

/**
 * Contiguous Array
 * <p>
 *     Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
 * </p>
 * <a href="https://leetcode.com/problems/contiguous-array/description/">Click here</a>
 */
public class ContiguousArray {
    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int answer = 0;
        int countOfOnes = 0;

        //Initial is always -1
        map.put(countOfOnes, -1);

        for (int i = 0; i <nums.length; i++) {
            if (nums[i] == 0) {
                countOfOnes--;
            } else {
                countOfOnes++;
            }
            if (map.containsKey(countOfOnes)) {
                //If same number of 0 and 1 is encountered, measure the length of subarray.
                answer = Math.max(answer, i - map.get(countOfOnes));
            } else {
                map.put(countOfOnes, i);
            }
        }
        return answer;
    }
}
