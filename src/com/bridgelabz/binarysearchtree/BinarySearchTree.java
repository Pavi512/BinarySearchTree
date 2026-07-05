package com.bridgelabz.binarysearchtree;

//Binary search tree class
public class BinarySearchTree<T extends Comparable<T>> {
    class Node {
        T data;
        Node left;
        Node right;

        Node(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    Node root;

    // Insert Method
    public void add(T data) {
        root = addRecursive(root, data);
    }

    // Recursive Insert
    private Node addRecursive(Node root, T data) {
        if (root == null) {
            return new Node(data);
        }

        if (data.compareTo(root.data) < 0) {
            root.left = addRecursive(root.left, data);
        }
        else if (data.compareTo(root.data) > 0) {
            root.right = addRecursive(root.right, data);
        }
        return root;
    }

    // Inorder Traversal
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    //Main method
    public static void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.add(56);
        bst.add(30);
        bst.add(70);

        System.out.println("Inorder Traversal:");
        bst.inorder(bst.root);
    }
}
