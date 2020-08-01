package com.passion2code.datastructures.queues;

public class QueueApp {
    public static void main(String[] args) {
        int deletedNode;
        MyQueue<Integer> q = new MyQueue<>();

        q.enQueue(31);
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(15);

        q.print();

        deletedNode = q.deQueue();
        System.out.println("Deleted: " + deletedNode);

        q.deQueue();
        q.deQueue();
        q.deQueue();

        q.print();
    }
}
