package bst;

import java.util.Scanner;

public class BST {
    
    public static void main(String[] args) {
        // Create new BinarySearchTree and new Scanner for user input
        BinarySearchTree bst = new BinarySearchTree();
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to input 15 integers and split integers by spaces
        System.out.println("Enter 15 integers (seperate by spaces): ");
        String[] input = sc.nextLine().split("\\s+");
        
        // Add integers to binary search tree
        for (String num: input) {
            bst.addNode(Integer.parseInt(num));
        }
        
        // Display integers
        System.out.println("Integers inorder: ");
        bst.inorder();
    }
}
