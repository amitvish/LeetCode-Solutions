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

    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        // leftSum rightSum maxSum, result
        helper(root);
        return maxSum;

    }

    private int helper(TreeNode node){
        //include either right or left
        if(node == null ) return 0;

        int leftMaxPath = Math.max(helper(node.left), 0);
        int rightMaxPath = Math.max(helper(node.right), 0);

        int localMax = node.val + leftMaxPath + rightMaxPath;

        maxSum = Math.max(maxSum, localMax);

        return node.val + Math.max(leftMaxPath, rightMaxPath);

    }
}