package Diameter_of_Binary_Tree_543;

public class Diameter_Practice {

    public static class TreeNode {
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

    int result = -1;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return result;
    }

    private int dfs(TreeNode current) {
        if (current == null)
            return 0;

        int leftHeight = dfs(current.left);
        int rightHeight = dfs(current.right);

        result = Math.max(result, (leftHeight + rightHeight));

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
