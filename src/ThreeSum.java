import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        //First sort number in order, such that last number is always biggest.
        Arrays.sort(nums);

        Set<List<Integer>> answer = new HashSet<>();

        for (int i = 0; i < nums.length; i ++ ) {
            if (i > 0 && nums[i] == nums[i-1]) {
                //if number[i] & previous number are equal
                continue;
            }
            //Counting from last index - k
            int k = nums.length - 1;
            //Number index J is always one after I
            for (int j = i+1; j<k;) {
                //i<j<k
                int total = nums[i] + nums[j] + nums[k];

                if (total == 0) {
                    answer.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    continue;
                } else if (total > 0) {
                    //If number too big, we reduce the number by moving backwards
                    k--;
                    continue;
                } else if (total < 0) {
                    //If number too small, we increase number by moving forward
                    j++;
                    continue;
                }
            }
        }

        return new ArrayList<>(answer);
    }
}
