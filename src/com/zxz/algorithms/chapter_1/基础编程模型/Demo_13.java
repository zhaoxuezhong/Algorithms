package com.zxz.algorithms.chapter_1.基础编程模型;

public class Demo_13 {

    public static void printTransposedMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%4d", matrix[j][i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = { { 100, 200, 300 }, { 400, 500, 600, 800} };
        printTransposedMatrix(a);
    }
}
