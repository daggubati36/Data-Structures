package com.passion2code.datastructures.trees.bst;

import com.passion2code.datastructures.trees.TraversalType;
import com.passion2code.datastructures.trees.Tree;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    @Override
    public void insert(T data) {
        if (root == null) {
            root = new Node<>(data);
        } else {
            insertNode(root, data);
        }
    }

    private void insertNode(Node<T> node, T data) {
        if (data.compareTo(node.getData()) <= 0) { // if the data is less than the root ==> Go to Left sub-tree
            if (node.getLeftChild() == null) {// if left child of current root is null == insert new node
                node.setLeftChild(new Node<>(data));
            } else {
                insertNode(node.getLeftChild(), data);
            }
        } else { // Go to right Sub-tree
            if (node.getRightChild() == null) {
                node.setRightChild(new Node<>(data));
            } else {
                insertNode(node.getRightChild(), data);
            }
        }
    }

    @Override
    public void delete(T data) {
        if (this.root != null)
            delete(root, data);
    }

    private Node<T> delete(Node<T> node, T data) {
        if (node == null) return null;

        if (data.compareTo(node.getData()) < 0)
            node.setLeftChild(delete(node.getLeftChild(), data));
        else if (data.compareTo(node.getData()) > 0)
            node.setRightChild(delete(node.getRightChild(), data));
        else {
            // If this is a leaf node
            if (node.getLeftChild() == null && node.getRightChild() == null)
                return null;

            //if the node has 1 right child
            if (node.getLeftChild() == null) {
                Node<T> temp = node.getRightChild();
                node = null;
                return temp;
            } else if (node.getRightChild() == null) { //if the node has 1 left child
                Node<T> temp = node.getLeftChild();
                node = null;
                return temp;
            }

            // If the node has 2 children
            // Get Predecessor node in the temp variable
            Node<T> predecessor = getPredecessor(node.getLeftChild());
            // swap the predecessor node with the current node
            node.setData(predecessor.getData());
            // Delete the old predecessor node
            node.setLeftChild(delete(node.getLeftChild(), predecessor.getData()));
        }
        return node;
    }

    private Node<T> getPredecessor(Node<T> node) {
        // get the max element in this tree
        // Max value will be the leaf node the right sub-tree
        if (node.getRightChild() != null)
            return getPredecessor(node.getRightChild());

        return node;
    }

    // This is implementation of "IN-ORDER" Traversal
    @Override
    public void traverse(TraversalType traversalType) {
        if (this.root != null) {
            switch (traversalType) {
                case INORDER:
                default:
                    inOrderTraverse(this.root);
                    break;
                case PREORDER:
                    preOrderTraverse(this.root);
                    break;
                case POSTORDER:
                    postOrderTraverse(this.root);
                    break;
            }
        } else
            System.out.println("Tree is empty");
    }

    private void inOrderTraverse(Node<T> node) {
        // Traverse left sub-tree and print the element
        if (node.getLeftChild() != null) {
            inOrderTraverse(node.getLeftChild());
        }
        // Print the root node
        System.out.print(node.getData() + " ");
        // Traverse left sub-tree and print the element
        if (node.getRightChild() != null) {
            inOrderTraverse(node.getRightChild());
        }
    }

    private void preOrderTraverse(Node<T> node) {
        // Assume first element is root ==> print
        System.out.print(node.getData() + " ");
        if (node.getLeftChild() != null)
            preOrderTraverse(node.getLeftChild());
        if (node.getRightChild() != null)
            preOrderTraverse(node.getRightChild());
    }

    private void postOrderTraverse(Node<T> node) {
        if (node.getLeftChild() != null) // Traverse left sub-tree
            postOrderTraverse(node.getLeftChild());

        if (node.getRightChild() != null)
            postOrderTraverse(node.getRightChild());

        System.out.print(node.getData() + " ");
    }

    @Override
    public T getMin() {
        Node<T> currentNode = this.root;
        while (currentNode.getLeftChild() != null) {
            currentNode = currentNode.getLeftChild();
        }
        return currentNode.getData();
    }

    @Override
    public T getMax() {
        Node<T> currentNode = this.root;
        while (currentNode.getRightChild() != null) {
            currentNode = currentNode.getRightChild();
        }
        return currentNode.getData();
    }
}
