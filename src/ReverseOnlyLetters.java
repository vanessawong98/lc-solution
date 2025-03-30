public class ReverseOnlyLetters {
    /**
     * small letters: 97 - 122
     * capital letters: 65 - 90
     */
    public static String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char leftChar = sb.charAt(left);
            char rightChar = sb.charAt(right);

            if (leftChar == sb.charAt(right)) {
                left++;
                right--;
                continue;
            }

            boolean leftCharIsSpecialChar = !Character.isLetter(leftChar);
            boolean rightCharIsSpecialChar = !Character.isLetter(rightChar);

            if (leftCharIsSpecialChar) {
                left++;
                continue;
            }
            if (rightCharIsSpecialChar) {
                right--;
                continue;
            }
            sb.setCharAt(left, rightChar);
            sb.setCharAt(right, leftChar);
            left++;
            right--;
        }

        return sb.toString();
    }
}
