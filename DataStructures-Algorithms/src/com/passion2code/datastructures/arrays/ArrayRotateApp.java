package com.passion2code.datastructures.arrays;

import java.util.Arrays;

public class ArrayRotateApp {
    private static int[] rotateByElements(int[] a, int num) {
        int[] b = new int[a.length];
        int j = 0;

        for (int i = num; i < a.length; i++) {
            b[j] = a[i];
            j++;
        }

        for (int i = 0; i < num; i++) {
            b[j] = a[i];
            j++;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int numToRotate = 0;

        System.out.println("Before: " + Arrays.toString(arr));

        arr = rotateByElements(arr, numToRotate);

        System.out.println("After: " + Arrays.toString(arr));

    }

}
