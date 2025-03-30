import java.util.List;

/**
 * Reverse Words in a String III
 * <p>
 *     Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 * </p>
 * <a href="https://leetcode.com/problems/reverse-words-in-a-string-iii/description/">Click here</a>
 */
public class ReverseStringIII {

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] stringList = s.split(" ");

        for (int i = 0; i<stringList.length; i++) {
            StringBuilder temp = new StringBuilder(stringList[i]);
            temp.reverse();
            sb.append(temp.toString());
            if (i != stringList.length - 1){
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
