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
    private int maxValue = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxValue;
    }

    private int helper(TreeNode node) {
        if (node == null) return 0;

        int leftpathSum = Math.max(helper(node.left), 0);
        int rightPathSum = Math.max(helper(node.right), 0);

        int localMax = node.val + leftpathSum + rightPathSum;

        maxValue = Math.max(maxValue, localMax);

        return node.val + Math.max(leftpathSum, rightPathSum);
    }
}
