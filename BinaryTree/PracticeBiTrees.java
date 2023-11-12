public class PracticeBiTrees {

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
            return "NODE: " + val;
        }
    }

    public static boolean isBalanced(TreeNode root) {
        // If the tree is empty, it is balanced
        if (root == null)
            return true;

        // Check the balance of the left and right subtrees
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        // If the difference in heights is more than 1, the tree is not balanced
        if (Math.abs(leftHeight - rightHeight) > 1)
            return false;

        // Recursively check the balance of the left and right subtrees
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private static int getHeight(TreeNode node) {
        if (node == null)
            return 0;

        // Return the maximum height plus 1 for the current node
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        // Return the maximum height plus 1 for the current node
        return Math.max(leftHeight, rightHeight) + 1;
    }




}
