/**
 * Minimum Depth of Binary Tree
 * <p>
 * Given a binary tree, find its minimum depth.
 * <p>
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * <p>
 * Note: A leaf is a node with no children.
 * <p>
 * Example 1<br>
 * Input: root = [3,9,20,null,null,15,7]<br>
 * Output: 2<br><br>
 * Example 2:<br>
 * Input: root = [2,null,3,null,4,null,5,null,6]<br>
 * Output: 5
 * <a href="https://leetcode.com/problems/minimum-depth-of-binary-tree/description/">Click here</a>
 */
public class BinaryTreeMinDepth {
    public int minDepth(TreeNode root) {
        //Using Depth First Search
        if (root == null) {
            return 0;
        }

        //Look at the left node first and return its depth
        int left = minDepth(root.left);
        int right = minDepth(root.right);

        //If left doesn't have children but right does, return right + root
        if (left == 0 && right > 0) { return right + 1; }
        //If right doesn't have children but left does, return left + root
        else if (right == 0 && left > 0) { return left + 1; }
        //Else just take the minimum of left and right
        return Math.min(left, right) + 1;
    }
}
