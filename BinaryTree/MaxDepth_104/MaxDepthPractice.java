package MaxDepth_104;

public class MaxDepthPractice {

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

        public String toString() {
            return "NODE: " + val;
        }
    }

    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
