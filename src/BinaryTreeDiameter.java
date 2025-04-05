/**
 * Binary Tree Largest Diameter
 * <a href="https://leetcode.com/problems/diameter-of-binary-tree/description/">Click here </a>
 */
public class BinaryTreeDiameter {

    private int diameter;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        traverse(root);
        return diameter;
    }

    public int traverse(TreeNode subtree) {
        if (subtree == null) {
            return 0;
        }
        int left =  traverse(subtree.left);
        int right = traverse(subtree.right);
        //Calculate current largest diameter while traversing through the nodes
        diameter = Math.max(diameter, left + right);
        return Math.max(left, right) + 1;
    }


}
