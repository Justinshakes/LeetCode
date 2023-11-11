package maxdepth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Maximum_Depth_of_Binary_Tree_104Test {

    @Test
    void testMaxDepth() {
        Maximum_Depth_of_Binary_Tree_104.TreeNode root = new Maximum_Depth_of_Binary_Tree_104.TreeNode(1);
        root.left = new Maximum_Depth_of_Binary_Tree_104.TreeNode(2);
        root.right = new Maximum_Depth_of_Binary_Tree_104.TreeNode(3);
        root.left.left = new Maximum_Depth_of_Binary_Tree_104.TreeNode(4);
        root.left.right = new Maximum_Depth_of_Binary_Tree_104.TreeNode(5);

        // Testing the maxDepth function
        int depth = Maximum_Depth_of_Binary_Tree_104.maxDepth(root);
        assertEquals(3, depth);
    }

    @Test
    void maxDepth() {
        // You can add additional test cases for the maxDepth method here
    }
}
