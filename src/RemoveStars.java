import java.util.Arrays;
import java.util.Stack;

/**
 * Removing Stars from a String
 * <p>
 *  You are given a string s, which contains stars *.
 * <p>
 * In one operation, you can:
 * <p>
 * Choose a star in s.
 * Remove the closest non-star character to its left, as well as remove the star itself.
 * Return the string after all stars have been removed.
 * <p>
 * Note:
 * <p>
 * The input will be generated such that the operation is always possible.
 * It can be shown that the resulting string will always be unique.
 * <p>
 * Input: s = "leet**cod*e"
 * Output: "lecoe"
 * Explanation: Performing the removals from left to right:
 * - The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
 * - The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
 * - The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
 * There are no more stars, so we return "lecoe".
 * <p>
 * Input: s = "erase*****"
 * Output: ""
 * Explanation: The entire string is removed, so we return an empty string.
 * <p>
 * <a href="https://leetcode.com/problems/removing-stars-from-a-string/description/">...</a>
 */
public class RemoveStars {
    public static String removeStars(String s) {

        Stack<String> stack = new Stack<>();
        for(Character c: s.toCharArray()) {
            if (c == '*') {
                stack.pop();
            } else {
                stack.push(String.valueOf(c));
            }
        }
        return String.join("", stack);
    }

}
