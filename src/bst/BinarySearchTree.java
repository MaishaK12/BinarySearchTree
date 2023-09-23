package bst;

import java.util.Stack;

public class BinarySearchTree {
    private Node root;
    
    // Represents a node in the tree
    private class Node {
        private final int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    
    // Add new node to tree
    public void addNode(int value) {
        root = addNode(root, value);
    }
    
    // Add new node to tree starting at the given node
    private Node addNode(Node node, int value) {
        // If node is null, create new node with given value
        if (node == null) {
            return new Node(value);
        }
        // If value is less than node's value, add to the left of tree; otherwise add to the right
        if (value < node.value) {
            node.left = addNode(node.left, value);
        } else {
            node.right = addNode(node.right, value);
        }
        // Return node (original or new)
        return node;
    }
    
    // Displays trees value inorder
    public void inorder(){
        // If root node is null, tree is empty
        if (root == null) {
            return;
        }

        // Create stackto hold nodes and start at root node
        Stack<Node> stack = new Stack<>();
        Node current = root;

        // Traverse tree until current node is null and stack is empty
        while (current != null || !stack.isEmpty()) {
            // Traverse left subtree and push nodes onto stack
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            // Pop node from stack and display its value
            current = stack.pop();
            System.out.print(current.value + " ");
            // Traverse right subtree
            current = current.right;
        }
    }
}
