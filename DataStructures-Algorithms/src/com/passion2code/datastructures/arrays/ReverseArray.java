package com.passion2code.datastructures.arrays;

import java.util.Arrays;

public class ReverseArray {

    public int[] reverseArrayInPlace(int[] arr) {

        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (endIndex > startIndex) {
            swap(arr, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }
        return arr;
    }

    private void swap(int arr[], int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
