import java.util.HashMap;
import java.util.Map;

public class NoRepeatSubstring {
    public static int lengthOfLongestSubstringWithHash(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int left, right;

        int answer = 0;

        for (left = 0, right = 0; right < s.length();){
            Character currentChar = s.charAt(right);
            Character previousChar = s.charAt(left);
            if (map.containsKey(currentChar)) {
                map.remove(previousChar);
                left++;
            } else {
                map.put(currentChar, map.getOrDefault(currentChar, 0)+1);
                right++;
            }
            answer = Math.max(map.size(), answer);
        }

        return answer;
    }
}
