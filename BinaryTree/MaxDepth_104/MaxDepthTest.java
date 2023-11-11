package MaxDepth_104;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxDepthTest {

    @Test
    void testMaxDepth() {
        MaxDepth.TreeNode root = new MaxDepth.TreeNode(1);
        root.left = new MaxDepth.TreeNode(2);
        root.right = new MaxDepth.TreeNode(3);
        root.left.left = new MaxDepth.TreeNode(4);
        root.left.right = new MaxDepth.TreeNode(5);

        // Testing the maxDepth function
        int depth = MaxDepth.maxDepth(root);
        assertEquals(3, depth);
    }

    @Test
    void maxDepth() {
        // You can add additional test cases for the maxDepth method here
    }
}
