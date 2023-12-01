package Same_Tree_100;

public class PracticeSameTree {

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

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        return dfs(p, q);
    }

    public static boolean dfs(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;

        if (p == null || q == null)
            return false;

        if (p.val != q.val)
            return false;

        boolean left = dfs(p.left, q.left);
        boolean right = dfs(p.right, q.right);

        return left && right;
    }
}
