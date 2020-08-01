package com.passion2code.datastructures.arrays.multiDimensional;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}}; // 2 X 3
        int[][] b = {{7, 8}, {9, 10}, {11, 12}}; // 3 X 2
        int r1 = a.length;
        int c1 = b[0].length;
        int colCount = b.length;
        int[][] r = new int[r1][c1]; // 2 X 2
        int sum = 0;

        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++) {
                for (int k = 0; k < colCount; k++) {
                    sum += (a[i][k] * b[k][j]);
                }
                r[i][j] = sum;
                sum = 0;
            }

        // Print the result array
        for (int i[] : r) {
            for (int j : i) {
                System.out.print(j + " ");
            }
        }

        System.out.println();
    }
}
