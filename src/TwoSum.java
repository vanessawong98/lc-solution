/**
 * Two Sum II - Input Array Is Sorted
 * <p>
 * <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/">Click here</a>
 */
public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        //Numbers are sorted
        int left = 0;
        int right = numbers.length - 1;
        int[] indexOfSum = new int[2];
        while (left <= right) {

            if (left == right) {
                break;
            }
            if (numbers[right] > target) {
                right--;
                continue;
            }

            if (numbers[left] > target) {
                return new int[0];
            }


            if (numbers[left] + numbers[right] == target) {
                indexOfSum[0] = left;
                indexOfSum[1] = right;
            } else if (numbers[left] + numbers[right] > target){
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            }
        }
        return indexOfSum;
    }
}
