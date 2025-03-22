import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 *              *
 *             / \
 *            *   *
 *           / \
 *          *   *
 */
public class BinaryTreeSideView {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public List<Integer> rightSideView(TreeNode root) {
        int depth = 0;
        List<Integer> results = new ArrayList<>();
        findRightNode(root, results, depth);
        return results;
    }

    public void findRightNode(TreeNode currentNode, List<Integer> result, int depth) {
        if (currentNode == null) {
            return;
        }

        if (depth == result.size()) {
            result.add(currentNode.val);
        }

        findRightNode(currentNode.right, result, depth+1);
        findRightNode(currentNode.left, result, depth+1);
    }


}


