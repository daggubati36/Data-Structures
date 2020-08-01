package com.passion2code.datastructures.trees;

public interface Tree<T> {
    public void insert(T data);

    public void delete(T data);

    public void traverse(TraversalType traverseType);

    public T getMin();

    public T getMax();
}
