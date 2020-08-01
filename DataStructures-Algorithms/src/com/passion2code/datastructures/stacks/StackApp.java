package com.passion2code.datastructures.stacks;

public class StackApp {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());

       // stack.push(50);

        System.out.println(stack.peek());

        System.out.println(stack.pop(50));
        System.out.println(stack.peek());

    }
}
