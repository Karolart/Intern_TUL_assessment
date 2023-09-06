package intern_tul_assessment;

public class BinaryTreeValidator {

    // Method to find the maximum value in a binary tree
    public static int maxValue(TreeNode node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        int value = node.data;
        int leftMax = maxValue(node.left);
        int rightMax = maxValue(node.right);

        return Math.max(value, Math.max(leftMax, rightMax));
    }

    // Method to find the minimum value in a binary tree
    public static int minValue(TreeNode node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }
        int value = node.data;
        int leftMin = minValue(node.left);
        int rightMin = minValue(node.right);

        return Math.min(value, Math.min(leftMin, rightMin));
    }

    // Method to check if a binary tree is a Binary Search Tree (BST)
    public static boolean isBST(TreeNode node) {
        return isBSTvalid(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    // Helper method to validate if a subtree is a BST
    private static boolean isBSTvalid(TreeNode node, int minValue, int maxValue) {
        if (node == null) {
            return true;
        }

        // If the current node's data is not within the valid range, it's not a BST
        if (node.data <= minValue || node.data >= maxValue) {
            return false;
        }

        // Recursively check the left and right subtrees
        return isBSTvalid(node.left, minValue, node.data) && isBSTvalid(node.right, node.data, maxValue);
    }
}
