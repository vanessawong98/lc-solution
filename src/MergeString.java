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
