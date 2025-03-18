import java.util.Scanner;

public class Matrix {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] A = new int[2][2];
int[][] B = new int[2][2];
int[][] result = new int[2][2];
        
// Input for matrix A
System.out.println("Enter elements of first 2x2 matrix (A):");
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
A[i][j] = sc.nextInt();
}}
        
// Input for matrix B
System.out.println("Enter elements of second 2x2 matrix (B):");
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
B[i][j] = sc.nextInt();
}}
        
System.out.println("Choose an operation:\n1. Addition\n2. Multiplication\n3. Transpose of A");
int choice = sc.nextInt();
        
switch (choice) {
case 1:
// Matrix Addition
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
result[i][j] = A[i][j] + B[i][j];
}}
System.out.println("Result of Addition:");
break;
            
case 2:
// Matrix Multiplication
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
result[i][j] = A[i][0] * B[0][j] + A[i][1] * B[1][j];
}}
System.out.println("Result of Multiplication:");
break;
            
case 3:
// Transpose of A
System.out.println("Transpose of Matrix A:");
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
System.out.print(A[j][i] + " ");
}
System.out.println();
}
return;
            
default:
System.out.println("Invalid choice!");
return;
}
        
// Display the result
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
System.out.print(result[i][j] + " ");
}
System.out.println();
}
sc.close();
}}
