import java.util.Arrays;

public class SortedSquare {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                square = nums[left] * nums[left];
                left++;
            } else {
                square = nums[right] * nums[right];
                right--;
            }
            answer[i] = square;
        }


        return answer;

    }
}
