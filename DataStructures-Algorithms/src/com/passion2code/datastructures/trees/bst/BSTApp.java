package com.passion2code.datastructures.trees.bst;

import com.passion2code.datastructures.trees.TraversalType;
import com.passion2code.datastructures.trees.Tree;

public class BSTApp {
    public static void main(String[] args) {
        Tree<Integer> bst = new BinarySearchTree<>();

        bst.insert(32);
        bst.insert(55);
        bst.insert(10);
        bst.insert(1);
        bst.insert(19);
        bst.insert(16);
        bst.insert(23);
        bst.insert(79);

        System.out.println("Max: " + bst.getMax());
        System.out.println("Min: " + bst.getMin());

        System.out.println();
        bst.traverse(TraversalType.INORDER);

        bst.delete(32);
        System.out.println();
        bst.traverse(TraversalType.INORDER);

    }
}
