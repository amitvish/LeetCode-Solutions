class Solution {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // find index of root element in inorder
        TreeNode root = new TreeNode(preorder[0]);

        HashMap<Integer, Integer> inOrderMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            inOrderMap.put(inorder[i], i);
        }

        return buildTreeHelper(
            preorder, 0, preorder.length - 1,
            inorder, 0, inorder.length - 1,
            inOrderMap);
    }

    private TreeNode buildTreeHelper(
        int[] preorder, int preStart, int preEnd,
        int[] inorder, int inStart, int inEnd,
        HashMap<Integer, Integer> inOrderMap) {

        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        int rootValue = preorder[preStart];
        TreeNode root = new TreeNode(rootValue);

        // find the root Index in inorder array
        int inRootIndex = inOrderMap.get(rootValue);
        int leftTreeSize = inRootIndex - inStart;

        // recursively construct left and right subtree
        root.left = buildTreeHelper(
            preorder, preStart + 1, preStart + leftTreeSize,
            inorder, inStart, inRootIndex - 1,
            inOrderMap);

        root.right = buildTreeHelper(
            preorder, preStart + leftTreeSize + 1, preEnd,
            inorder, inRootIndex + 1, inEnd,
            inOrderMap);

        return root;
    }
}
