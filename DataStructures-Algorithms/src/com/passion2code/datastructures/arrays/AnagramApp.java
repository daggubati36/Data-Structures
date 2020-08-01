package com.passion2code.datastructures.arrays;

import java.util.Arrays;

public class AnagramApp {
    public static void main(String[] args) {
        String subject = "restful";
        String anagram = "fluster";

        boolean result = isAnagram(subject, anagram);

        System.out.println("Is Anagram: " + result);
    }

    private static boolean isAnagram(String sub, String angr) {
        char[] arr1 = sub.toCharArray();
        char[] arr2 = angr.toCharArray();

        if (arr1.length != arr2.length)
            return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
}
