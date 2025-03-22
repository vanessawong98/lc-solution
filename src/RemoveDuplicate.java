import java.util.*;

/**
 * Remove Duplicates from an array (Without library)
 * <p>
 * <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/">Click here</a>
 */

public class RemoveDuplicate {

    public static int removeDuplicates(int[] nums) {
        Set<Integer> answer = new HashSet<>();
        int numsLength = nums.length;
        if (numsLength == 1) {
            return 1;
        } else if (numsLength == 0) {
            return 0;
        } else {
            for (int i = 0; i < numsLength; i++) {
                if ((i + 1) < numsLength) {
                    if (nums[i] != nums[i + 1]) {
                        answer.add(nums[i]);
                    }
                } else if (i == numsLength-1){
                    // 'i' is at the last index
                    answer.add(nums[i]);
                }
            }

            List<Integer> answerList = new ArrayList<>(answer);
            Collections.sort(answerList);
            for (int i = 0; i < answerList.size(); i++) {
                nums[i] = answerList.get(i);
            }
        }
        return answer.size();
    }
}
