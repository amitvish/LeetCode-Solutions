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
 */
class Solution {
    Integer prev = null;
    int minDifference = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        // do inorder traversal
        inorder(root);
        return minDifference;
    }

    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        if (prev != null) {
            minDifference = Math.min(minDifference, node.val - prev);
        }
        prev = node.val;
        inorder(node.right);
    }
}
