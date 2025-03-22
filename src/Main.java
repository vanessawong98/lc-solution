import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Playground for running solutions.
 */
public class Main {
    public static void main(String[] args) {

        /**
         * LRU Caching
         */
//        LRUCache lRUCache = new LRUCache(2);
//        lRUCache.put(1, 1); // cache is {1=1}
//        lRUCache.put(2, 2); // cache is {1=1, 2=2}
//        System.out.println(lRUCache.get(1)); ;    // return 1
//        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
//        System.out.println(lRUCache.get(2));    // returns -1 (not found)
//        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
//        System.out.println(lRUCache.get(1));    // return -1 (not found)
//        System.out.println(lRUCache.get(3));    // return 3
//        System.out.println(lRUCache.get(4));    // return 4

        /**
         * Merge String
         */
//        MergeString mergeString = new MergeString();
//        System.out.println(mergeString.mergeAlternately("abjsjdrew", "qwer"));

        /**
         * Three sum == 0
         */
//        ThreeSum solution = new ThreeSum();
//        int[] arr = {-1,0,1,2,-1,-4};
//        System.out.println(solution.threeSum(arr));

        /**
         * Return right side of binary tree
         * Not working
         */
//        BinaryTreeSideView bt = new BinaryTreeSideView();

        /**
         * Remove duplicates
         */
//        int[] nums = {-3,-1,0,0,0,3,3}; // Input array
//        int[] expectedNums = {-3,-1,0,3}; // The expected answer with correct length
//
//        int k = RemoveDuplicate.removeDuplicates(nums); // Calls your implementation
//
//        assert k == expectedNums.length;
//        for (int i = 0; i < k; i++) {
//            System.out.println( nums[i]);
//        }

        /**
         * Best Time to buy stocks (1)
         */
        int[] prices = {7,1,5,3,6,4};
        System.out.println(BestTimeToBuyStocks.maxProfit(prices));
    }
}