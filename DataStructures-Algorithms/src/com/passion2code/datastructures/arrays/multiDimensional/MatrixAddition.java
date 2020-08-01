package com.passion2code.datastructures.arrays.multiDimensional;

/*
THIS IS A PROGRAM TO ADD MATRICES
 */

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8, 9}, {1}};
        int[][] c;
        boolean isSameSize = true;

        print(a);
        print(b);

        // Check if the sizes (rows and columns) are same
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i].length != b[i].length) {
                        isSameSize = false;
                        break;
                    }
                }
            }
        }

        // If same, perform addition
        if (isSameSize) {
            c = new int[a.length][a[0].length];
            for (int i = 0; i < a.length; i++)
                for (int j = 0; j < a[i].length; j++)
                    c[i][j] = a[i][j] + b[i][j];
            print(c);
        } else
            System.out.println("Sizes are not same: Cannot perform Addition");
    }

    private static void print(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
        }
        System.out.println();
    }
}
