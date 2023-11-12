package Diameter_of_Binary_Tree_543;

// Last Practiced Nov 11th 2023
// Needs practice
public class Diameter_BiTree {

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
            return -1;

        int left = 1 + dfs(current.left);
        int right = 1 + dfs(current.right);

        result = Math.max(result, (left + right));
        return Math.max(left, right);
    }


}
