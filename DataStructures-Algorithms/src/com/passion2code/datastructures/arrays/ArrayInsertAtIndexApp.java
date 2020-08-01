package com.passion2code.datastructures.arrays;

/**
 * Program for Inserting an element into the array
 *
 * Runtime: O(N) + O(1) + O(N) ==> O(2N) == O(N)
 */

import java.util.Arrays;

public class ArrayInsertAtIndexApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Original: " + Arrays.toString(arr));
        int[] newArr = insertElement(arr, 6, 15);
        System.out.println("Original: " + Arrays.toString(newArr));
    }

    public static int[] insertElement(int[] arr, int pos, int ele) {
        int newArr[] = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) { // O(N) Runtime
            newArr[i] = arr[i];
        }
        newArr[pos] = ele; // O(1)
        for (int i = pos; i < arr.length; i++) { // O(N)
            int j = i;
            newArr[++j] = arr[i];
        }
        return newArr;
    }
}
