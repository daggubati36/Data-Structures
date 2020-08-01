package com.passion2code.datastructures.linkedList;

import java.util.Random;

public class LinkedListApp {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.insert(10);
        list.insert(8);
        list.insert(18);
        list.insertLast(12);

        list.print();
        System.out.println();

        list.remove(25);

        list.print();
        System.out.println();

        System.out.println(list.search(8));

    }

    public static void singlyLL(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>(); // Singly Linked List
        Random random = new Random();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println(list.size());
        System.out.println(list.search(40));
        list.print();

        list.remove(40);

        System.out.println(list.search(40));
        System.out.println(list.size());
        list.print();

        list.insertLast(11);
        list.print();

    }
}
