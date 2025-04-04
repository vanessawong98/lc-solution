import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Validate Stack Sequence
 * <p>
 * Given two integer arrays pushed and popped each with distinct values,
 * return
 * true if this could have been the result of a sequence of push and pop operations on an initially empty stack,
 * or false otherwise.
 * <p>
 * Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
 * Output: true
 * Explanation: We might do the following sequence:
 * push(1), push(2), push(3), push(4),
 * pop() -> 4,
 * push(5),
 * pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
 * <p>
 * Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
 * Output: false
 * Explanation: 1 cannot be popped before 2.
 * <p>
 *     <a href="https://leetcode.com/problems/validate-stack-sequences/description/">Click here</a>
 * </p>
 */
public class ValidateStack {

    public static boolean validate(int[] pushed, int[] popped) {

        Stack<Integer> stack = new Stack<>();

        int pushPointer = 0;
        int popPointer = 0;
        //Assuming pushed and popped has the same array length
        //Since stack is last in first out,
        //We can check whether the pushed number is in the popped array
        //If it is, we will pop the number first and move the pop pointer
        //else, push all numbers from the pushed array, and pop all after.
        //If the stack is not empty, it indicates that the order of pushed and popped operation is not possible.
        for (pushPointer = 0, popPointer = 0; pushPointer < pushed.length;) {
            stack.push(pushed[pushPointer]);
            if (popped[popPointer] == stack.peek()) {
                stack.pop();
                popPointer++;
            }
            pushPointer++;
        }

        while (popPointer < popped.length) {
            if (stack.peek() == popped[popPointer]) {
                stack.pop();
            }
            popPointer++;
        }
        return stack.isEmpty();
    }

}
