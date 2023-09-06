package intern_tul_assessment;

import static intern_tul_assessment.BinaryTreeValidator.isBST;

/**
 * This is the main class that contains the entry point of the program.
 */
public class Main {

    public static void main(String[] args) {
        // Create a binary tree with the following structure:
        //         4
        //        / \
        //       7   5
        //      / \
        //     1   3
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(7);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        // Check if the binary tree represented by 'root' is a Binary Search Tree (BST)
        if (isBST(root)) {
            System.out.println("Is BST");
        } else {
            System.out.println("Not a BST");
        }
    }
}
