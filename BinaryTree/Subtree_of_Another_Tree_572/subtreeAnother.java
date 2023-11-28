package Subtree_of_Another_Tree_572;


import BalancedBiTree_110.balTree;

public class subtreeAnother {

    public static class TreeNode {
        int val;
        balTree.TreeNode left;
        balTree.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, balTree.TreeNode left, balTree.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public String toString() {
            return "Node: " + val;
        }
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == subRoot) {
            boolean match = checkIfMatch(root, subRoot);
        }

        Z
        return false;
    }

    public boolean checkIfMatch(TreeNode root, TreeNode subRoot) {

    }

    public static void main(String[] args) {

    }


}
