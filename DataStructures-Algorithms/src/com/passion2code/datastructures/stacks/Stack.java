package com.passion2code.datastructures.stacks;

public interface Stack<T> {
    public void push(T data);

    public Object pop(T data);

    public Object peek();

    public int size();
}
