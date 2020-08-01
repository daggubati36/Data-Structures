package com.passion2code.datastructures.arrays;

import java.util.Arrays;

public class ReverseArrayApp {
    public static void main(String[] args) {
        int myArr[] = {1,2,3,4,5};
        System.out.println("Original: "+ Arrays.toString(myArr));
        ReverseArray reverseArray = new ReverseArray();
        int revs[] = reverseArray.reverseArrayInPlace(myArr);
        System.out.println("Reverse: " + Arrays.toString(revs));
    }
}
