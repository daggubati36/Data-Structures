package com.passion2code.datastructures.queues;

public class MyQueue<T> implements Queue<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size;

    @Override
    public void enQueue(T data) {
        Node<T> newNode = new Node<>(data);
        Node<T> oldLastNode = this.lastNode;
        this.lastNode = newNode;
        if (isEmpty()) {
            this.firstNode = this.lastNode;
        } else {
            oldLastNode.setNextNode(this.lastNode);
        }

        ++this.size;
    }

    @Override
    public T deQueue() {
        --this.size;
        Node<T> oldFirstNode = this.firstNode;
        this.firstNode = this.firstNode.getNextNode();
        return oldFirstNode.getData();
    }

    @Override
    public T peek() {
        return this.firstNode.getData();
    }

    @Override
    public boolean isEmpty() {
        return this.firstNode == null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void print() {
        Node<T> currentNode = this.firstNode;

        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNextNode();
        }
        System.out.println();
    }
}
