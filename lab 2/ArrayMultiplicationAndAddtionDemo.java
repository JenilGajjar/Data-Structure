// 1. Read two mxm matrices and perform addition of matrices into third matrix and print it.
// 2. Read two matrices, first mxn and second nxm, perform multiplication operation and store result in 
// third matrix and print it.

import java.util.Scanner;

public class ArrayMultiplicationAndAddtionDemo {

    public static void arrayAddition(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Addition of the given matrices");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                // System.out.println(" The value at matrix2[" + i + "]" + "[" + j + "] : ");
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void matrixMultiplication(int[][] matrix1, int[][] matrix2) {

        int row = matrix1.length;
        int col = matrix2[0].length;
        int n = matrix2.length;
        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = 0;
                for (int k = 0; k < n; k++) {

                    matrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Multiplication of the given matrices ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // System.out.println(" The value at matrix1[" + i + "]" + "[" + j + "] : ");
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows of matrix1 ");
        int rows1 = sc.nextInt();
        System.out.println("Enter the number of cols of matrix1 ");
        int cols1 = sc.nextInt();

        int[][] matrix1 = new int[rows1][cols1];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.println("Enter the value at  matrix1[" + i + "]" + "[" + j + "]");
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1 ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                // System.out.println(" The value at matrix1[" + i + "]" + "[" + j + "] : ");
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the number of rows of matrix2 ");
        int rows2 = sc.nextInt();
        System.out.println("Enter the number of cols of matrix2 ");
        int cols2 = sc.nextInt();

        int[][] matrix2 = new int[rows2][cols2];

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.println("Enter the value at  matrix2[" + i + "]" + "[" + j + "]");
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 2 ");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        if (rows1 == rows2 && cols1 == cols2) {
            arrayAddition(matrix1, matrix2);
        } else {
            System.out.println("Matrix Addition is not possible ");
        }

        if (matrix1[0].length == matrix2.length) {
            matrixMultiplication(matrix1, matrix2);
        } else {
            System.out.println("Matrix Multilplication is Not Possible ");
        }
        sc.close();

    }
}
