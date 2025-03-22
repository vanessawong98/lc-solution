/**
 * Merge String problem
 * <p>
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
 * If a string is longer than the other, append the additional letters onto the end of the merged string.
 * Return the merged string.
 * <p>
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r
 * <p>
 * <a href="https://leetcode.com/problems/merge-strings-alternately/description/">Click here</a>
 */

public class MergeString {
    public String mergeAlternately(String word1, String word2) {
        int word1Length = word1.length();
        int word2Length = word2.length();

        StringBuilder wordBuilder = new StringBuilder();
        for (int i = 0; i < word1Length+word2Length; i ++) {
            if (i < word1Length) {
                wordBuilder.append(word1.charAt(i));
            }
            if (i < word2Length) {
                wordBuilder.append(word2.charAt(i));
            }
        }

        return wordBuilder.toString();
    }
}
