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

    public static TreeNode invertTree(TreeNode root) {
        // Base Case
        if (root == null)
            return null;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // Swap Nodes
        root.right = left;
        root.left = right;

        return root;
    }




}
