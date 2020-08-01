package com.passion2code.datastructures.arrays;

import java.util.Arrays;

public class ArrayDeleteAtIndexApp {
    public static void deleteAtIndex(int[] arr, int pos) {
        int newArr[] = new int[arr.length-1];
        for (int i = pos; i < arr.length-1; i++) {
            int j = i;
            arr[i] = arr[++j];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        deleteAtIndex(arr, 7);

    }

}
