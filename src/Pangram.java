import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Check if the Sentence Is Pangram
 * <p>
 *     A pangram is a sentence where every letter of the English alphabet appears at least once.
 *
 *     Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 * </p>
 * <a href="https://leetcode.com/problems/check-if-the-sentence-is-pangram/editorial/">Click here</a>
 */
public class Pangram {
    public static boolean checkIfPangram(String sentence) {
        char[] aToZ = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Set<Character> pangramSet = new HashSet<>();
        /**
         * Skip all processing if sentence length is less than number of characters in the English alphabet.
         */
        if (sentence.length() < 25) {
            return false;
        }

        for (int i = 0; i < aToZ.length; i++) {
            if (sentence.contains(String.valueOf(aToZ[i]))){
                pangramSet.add(aToZ[i]);
            }
        }

        return pangramSet.size() == 26;
    }
}
