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

    public int goodNodes(TreeNode root) {
        //maintain max value and count
        //do prorder traversal;
        return preorder(root, Integer.MIN_VALUE);
    }

    private int preorder(TreeNode root, int max) {
        int count = 0;
        if (root == null) return 0;
        if (root.val >= max) {
            count = 1;
            max = root.val;
        }
        return count + preorder(root.left, max) + preorder(root.right, max);
    }
}
