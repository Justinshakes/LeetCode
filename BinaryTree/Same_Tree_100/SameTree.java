package Same_Tree_100;

public class SameTree {
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

    public static void main(String[] args) {
//        TreeNode tree1 = new TreeNode(1);
//        tree1.left = new TreeNode(2);
//        tree1.right = new TreeNode(3);
//
//        TreeNode tree2 = new TreeNode(1);
//        tree2.left = new TreeNode(2);
//        tree2.right = new TreeNode(3);

//        TreeNode tree1 = new TreeNode(1);
//        tree1.left = new TreeNode(2);
//        tree1.right = new TreeNode(1);
//
//        TreeNode tree2 = new TreeNode(1);
//        tree2.left = new TreeNode(1);
//        tree2.right = new TreeNode(2);

        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.left.right = new TreeNode(7);
        tree1.right = new TreeNode(3);
        tree1.right.right = new TreeNode(4);
        tree1.right.right.left = new TreeNode(5);
        tree1.right.right.left.right = new TreeNode(2);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.left.right = new TreeNode(7);
        tree2.right = new TreeNode(3);
        tree2.right.right = new TreeNode(4);
        tree2.right.right.left = new TreeNode(5);


        System.out.println(isSameTree(tree1, tree2));


    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        return dfs(p, q);
    }

    private static boolean dfs(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) return false;

        boolean left = dfs(p.left, q.left);
        boolean right = dfs(p.right, q.right);

        return left && right;
    }
}
