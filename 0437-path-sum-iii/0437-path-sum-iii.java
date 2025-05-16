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

    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        int pathFromRoot = helper(root, (long)targetSum);
        int pathFromLeft = pathSum(root.left, targetSum);
        int pathFromRight = pathSum(root.right, targetSum);

        return pathFromRoot + pathFromLeft + pathFromRight;
    }

    private int helper(TreeNode node, long targetSum) {
        if (node == null) return 0;

        int count = 0;
        if (node.val == targetSum) count = 1;

        long newSum = targetSum - (long)node.val;

        count += helper(node.left, newSum);
        count += helper(node.right, newSum);

        return count;
    }
}
