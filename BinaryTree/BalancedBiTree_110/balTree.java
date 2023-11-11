package BalancedBiTree_110;

// last practiced: Nov 11th 2023
// Needs Lots Of Practice

public class balTree {

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
        public static void main(String[] args) {
            // Create a binary tree with the values 3, 9, 20, 15, 7
            TreeNode root = new TreeNode(3);
            root.left = new TreeNode(9);
            root.right = new TreeNode(20);
            root.right.left = new TreeNode(15);
            root.right.right = new TreeNode(7);

            // Test the isBalanced method
            boolean isBalanced = isBalanced(root);

            // Print the result
            System.out.println("Is the tree balanced? " + isBalanced);

//            // Create a binary tree with the values 1, 2, 2, 3, 3, 4, 4
//            TreeNode root = new TreeNode(1);
//            root.left = new TreeNode(2);
//            root.right = new TreeNode(2);
//            root.left.left = new TreeNode(3);
//            root.left.right = new TreeNode(3);
//            root.left.left.left = new TreeNode(4);
//            root.left.left.right = new TreeNode(4);
//
//            // Test the isBalanced method
//            boolean isBalanced = isBalanced(root);
//
//            // Print the result
//            System.out.println("Is the tree balanced? " + isBalanced);
        }

    // Solution 1 --------------------------------------------------------------

    // isBalanced method
    public static boolean isBalanced(TreeNode root) {
        // If the tree is empty, it is balanced
        if (root == null) {
            return true;
        }

        // Check the balance of the left and right subtrees
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        // If the difference in heights is more than 1, the tree is not balanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        // Recursively check the balance of left and right subtrees
        return isBalanced(root.left) && isBalanced(root.right);
    }

    // Helper method to calculate the height of the tree
    private static int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // Calculate the height of the left and right subtrees
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        // Return the maximum height plus 1 for the current node
        return Math.max(leftHeight, rightHeight) + 1;
    }






//    // Solution 2 ----------------------------------------------------------------
//
//    // isBalanced method using the Drill Down and Respond Back Up approach
//    public boolean isBalanced(TreeNode root) {
//        // If the tree is balanced, the height is >= 0; otherwise, it is -1
//        return heightAndBalanced(root) != -1;
//    }
//
//    // Helper method to calculate the height and check balance
//    private int heightAndBalanced(TreeNode node) {
//        // Base case: a null node is height balanced with height -1
//        if (node == null) {
//            return 0;
//        }
//
//        // Recursively get the height and balance of the left subtree
//        int leftHeight = heightAndBalanced(node.left);
//        if (leftHeight == -1) {
//            return -1; // Left subtree is unbalanced
//        }
//
//        // Recursively get the height and balance of the right subtree
//        int rightHeight = heightAndBalanced(node.right);
//        if (rightHeight == -1) {
//            return -1; // Right subtree is unbalanced
//        }
//
//        // Check if the current subtree is balanced
//        if (Math.abs(leftHeight - rightHeight) > 1) {
//            return -1; // Current subtree is unbalanced
//        }
//
//        // Return the height of the current subtree
//        return Math.max(leftHeight, rightHeight) + 1;
//    }
}
