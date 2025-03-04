import java.util.Scanner;

public class Matrix2X2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrixA = new int[2][2];
        int[][] matrixB = new int[2][2];
        int[][] resultMatrix = new int[2][2];

        System.out.println("Enter elements of 2x2 matrix A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of 2x2 matrix B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Transpose of matrix A");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                resultMatrix = addMatrices(matrixA, matrixB);
                System.out.println("Result of addition:");
                break;
            case 2:
                resultMatrix = multiplyMatrices(matrixA, matrixB);
                System.out.println("Result of multiplication:");
                break;
            case 3:
                resultMatrix = transposeMatrix(matrixA);
                System.out.println("Transpose of matrix A:");
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        printMatrix(resultMatrix);
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
            }
        }
        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
