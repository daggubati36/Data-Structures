package com.passion2code.datastructures.stacks;

import com.passion2code.datastructures.linkedList.MyLinkedList;

public class MyStack<T> extends MyLinkedList<T> implements Stack<T> {
    private MyLinkedList<T> list;
    private int size;

    public MyStack() {
        this.list = new MyLinkedList<>();
    }

    @Override
    public void push(T data) {
        list.insert(data);
        ++this.size;
    }

    @Override
    public Object pop(T data) {
        --this.size;
        return list.remove(data);
    }

    @Override
    public Object peek() {
        return list.getFirstNode();
    }

    @Override
    public int size() {
        return this.size;
    }
}
