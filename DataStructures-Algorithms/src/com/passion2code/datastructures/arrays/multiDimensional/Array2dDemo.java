package com.passion2code.datastructures.arrays.multiDimensional;

public class Array2dDemo {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};

        System.out.println(a.length); // number of rows
        System.out.println(a[0].length); // number of elements in 0th row
        System.out.println(a[1].length); // number of elements in 1st row
        System.out.println(a[2].length); // number of elements in 2nd row

        // Print all elements in array
        for (int[] i : a)
            for (int j : i) System.out.print(j + " ");

        System.out.println();
    }
}
