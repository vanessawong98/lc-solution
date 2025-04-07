
import java.util.LinkedList;
import java.util.Queue;

/**
 * Deepest Leaves Sum
 * <p>
 * Given the root of a binary tree, return the sum of its deepest leaves<br>
 * <a href="https://leetcode.com/problems/deepest-leaves-sum/description">Click here</a>
 */
public class BinaryTreeLeafSum {
    public int findSum(TreeNode root) {
        Queue<TreeNode> searchQueue = new LinkedList<>();

        searchQueue.add(root);

        int level = 0;
        int sumOfNodes = 0;
        while (!searchQueue.isEmpty()) {
            int numberOfNodes = searchQueue.size();
            //Resetting sum of nodes at every level
            //Such that at the end of the loop, only keep the last level sum
            sumOfNodes = 0;
            for (int i = 0; i < numberOfNodes; i++) {
                TreeNode node = searchQueue.remove();
                int nodeVal = node.val;

                sumOfNodes += nodeVal;

                if (node.left != null) {
                    searchQueue.add(node.left);
                }
                if (node.right != null) {
                    searchQueue.add(node.right);
                }
            }
            level++;
        }
        System.out.println("Binary Tree max depth:: "+level);
        return sumOfNodes;
    }
}
