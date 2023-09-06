package intern_tul_assessment;

// Class representing a node in a binary tree
public class TreeNode {
    public int data;        // The data stored in this node
    public TreeNode left;   // Reference to the left child node
    public TreeNode right;  // Reference to the right child node

    // Constructor to initialize a TreeNode with the given data
    public TreeNode(int data) {
        this.data = data;     // Initialize data
        this.left = null;     // Initialize left child as null
        this.right = null;    // Initialize right child as null
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
    
    
}
