import java.util.Arrays;

public class KRadSubarrAvg {
    public static int[] getAverages(int[] nums, int k) {
        if (nums.length < k) {
            Arrays.fill(nums, -1);
            return nums;
        }

        long[] prefix = new long[nums.length];
        int[] answer = new int[nums.length];
        int subArrLength = k*2+1;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                prefix[0] = nums[0];
                continue;
            }

            prefix[i] = nums[i]+prefix[i-1];
        }

        Arrays.fill(answer, -1);

        for (int i = k; i < nums.length - k; i++) {
            long sum;
            if (i == k) {
                sum = prefix[i+k];
            } else if (k == 0) {
                sum = nums[i];
            } else {
                long toMinus = prefix[i-k-1];
                long totalSum = prefix[i+k];
                sum = totalSum - toMinus;
            }
            long avg = sum/subArrLength;
            answer[i] = (int) avg;
        }

        return answer;
    }
}
