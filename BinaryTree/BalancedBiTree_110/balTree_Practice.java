package BalancedBiTree_110;

public class balTree_Practice {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

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
        if (root == null)
            return true;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static int getHeight(TreeNode node) {
        if (node == null)
            return 0;

        int leftHeight = 1 + getHeight(node.left);
        int rightHeight = 1 + getHeight(node.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }


}
