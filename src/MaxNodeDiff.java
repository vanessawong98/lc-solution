/**
 * Maximum Difference Between Node and Ancestor
 * <p>
 * Given the root of a binary tree, find the maximum value v for which there exist different nodes a and b where v = |a.val - b.val| and a is an ancestor of b.
 * <p>
 *  A node a is an ancestor of b if either: any child of a is equal to b or any child of a is an ancestor of b.<br>
 *  Example 1: <br>
 * Input: root = [8,3,10,1,6,null,14,null,null,4,7,13] <br>
 * Output: 7 <br
 * Explanation: We have various ancestor-node differences, some of which are given below :<br>
 * |8 - 3| = 5<br>
 * |3 - 7| = 4<br>
 * |8 - 1| = 7<br>
 * |10 - 13| = 3<br>
 * Among all possible differences, the maximum value of 7 is obtained by |8 - 1| = 7.<br>
 * <p>
 * Example 2: <br>
 * Input: root = [1,null,2,null,0,3]<br>
 * Output: 3<br>
 *
 * <a href="https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/editorial/">Click here</a>
 */
public class MaxNodeDiff {
    int diff = 0;
    public int maxAncestorDiff(TreeNode root) {

        int maxDifference = 0;

        if (root == null) {
            return 0;
        }

        findMaxDiff(root, root.val, root.val);

        return diff;
    }

    public void findMaxDiff(TreeNode node, int min, int max) {
        if (node == null) {
            return;
        }
        int curr = node.val;

        //Find the smallest node in the tree
        min = Math.min(curr, min);
        //Find the largest node in the tree
        max = Math.max(curr, max);
        findMaxDiff(node.left, min, max);
        findMaxDiff(node.right, min, max);
        //Calculate the difference and find the max difference
        diff = Math.max(diff, Math.abs(max - min));
    }
}
