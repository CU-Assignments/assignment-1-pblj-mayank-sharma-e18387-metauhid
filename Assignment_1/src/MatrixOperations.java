package Assignment_1;
import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of matrices: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Matrix Addition
        int[][] sumMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println("Matrix Addition Result:");
        displayMatrix(sumMatrix);

        // Matrix Subtraction
        int[][] diffMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                diffMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        System.out.println("Matrix Subtraction Result:");
        displayMatrix(diffMatrix);

        // Matrix Multiplication (Only for square matrices)
        if (rows == cols) {
            int[][] productMatrix = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    for (int k = 0; k < cols; k++) {
                        productMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }

            System.out.println("Matrix Multiplication Result:");
            displayMatrix(productMatrix);
        } else {
            System.out.println("Matrix multiplication is only possible for square matrices.");
        }

        scanner.close();
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
