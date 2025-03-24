/**
 * Reverse String problem
 * <p>
 * <a href="https://leetcode.com/explore/featured/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4592/">Click here</a>
 */

public class ReverseString {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            if (left == right) {
                break;
            }

            char leftChar = s[left];
            char rightChar = s[right];

            s[right] = leftChar;
            s[left] = rightChar;

            right--;
            left++;
        }
    }
}
