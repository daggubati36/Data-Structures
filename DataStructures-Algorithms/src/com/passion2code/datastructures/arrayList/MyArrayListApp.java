package com.passion2code.datastructures.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MyArrayListApp {
    public static void main(String[] args) {
        Random random = new Random();
        MyArrayList<Integer> list = new MyArrayList<>();

        for (int i = 0; i < 15; i++) {
            list.add(random.nextInt(50));
        }
        System.out.println("Size: " + list.size());

        list.print();

        list.remove(10);

        System.out.println("Size: " + list.size());

        list.print();

    }
}
