package com.passion2code.datastructures.arrays;

public class ArrayDuplicateApp {

    private static boolean hasDuplicates(int[] arr) {
        boolean isDuplicate = false;
        int duplicate = -1;

        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            for (int j = ele; j < arr.length; j++) {
                if (arr[j] == ele) {
                    isDuplicate = true;
                    duplicate = arr[j];
                }
            }
        }

        if (isDuplicate)
            System.out.println("Found duplicate: " + duplicate);
        return isDuplicate;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 4, 5, 6, 7};

        boolean result = hasDuplicates(a);

        if (result)
            System.out.println("Duplicate Found");
        else
            System.out.println("Duplicate NOT Found");
    }
}
