package BalancedBiTree_110;

public class balTree_Practice {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public String toString() {
            return "Node: " + val;
        }
    }

    public static boolean isBalanced(TreeNode root) {
       return heightAndBalanced(root) != -1;
    }

    private static int heightAndBalanced(TreeNode node) {
        if (node == null)
            return 0;

        int leftHeight = heightAndBalanced(node.left);
        if (leftHeight == -1)
            return -1;

        int rightHeight = heightAndBalanced(node.right);
        if (rightHeight == -1)
            return -1;

        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }


}
