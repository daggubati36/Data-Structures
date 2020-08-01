package com.passion2code.datastructures.queues;

public interface Queue<T> {
    public void enQueue(T data);

    public T deQueue();

    public T peek();

    public boolean isEmpty();

    public int size();

    public void print();
}
