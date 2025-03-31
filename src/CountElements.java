import java.util.*;

/**
 * Counting Elements
 * <p>
 *     Given an integer array arr, count how many elements x there are, such that x + 1 is also in arr. If there are duplicates in arr, count them separately.
 * </p>
 * <p>
 *     Premium qns
 * </p>
 * <a href="https://leetcode.com/problems/counting-elements/description/">Click here</a>
 */
public class CountElements {
    public static int countElements(int[] arr) {
        Arrays.sort(arr);
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (list.contains(arr[i] + 1)){
                set.add(i);
            }
        }
        return set.size();
    }
}
