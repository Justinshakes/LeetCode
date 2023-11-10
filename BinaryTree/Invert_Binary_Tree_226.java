public class Invert_Binary_Tree_226 {

    // Last practiced Oct 9th
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
        if (root == null)
            return null;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // swap nodes
        root.right = left;
        root.left = right;

        return root;
    }



    public static void main(String[] args) {

        TreeNode test = new TreeNode(4);
        test.left = new TreeNode(2);
        test.right = new TreeNode(7);

        test.left.left = new TreeNode(1);
        test.left.right = new TreeNode(3);

        test.right.left = new TreeNode(6);
        test.right.right = new TreeNode(9);

        TreeNode inverted = invertTree(test);

        System.out.println("DONE");
    }
}
