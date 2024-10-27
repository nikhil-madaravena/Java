

import java.util.Scanner;

public class MatrixForEach {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the order of matrix: ");
        int m = sc.nextInt();

        int[] column = new int[m];
        int[][] a = new int[m][];

        // Input the number of columns for each row
        for (int i = 0; i < m; i++) {
            System.out.println("Enter size of row " + i + ": ");
            column[i] = sc.nextInt();
            a[i] = new int[column[i]]; // Initialize each row with the specified column size
        }

        // Fill the matrix with user input
        for (int i = 0; i < m; i++) {
            System.out.println("Enter elements for row " + i + ": ");
            for (int j = 0; j < column[i]; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Print the matrix using a for-each loop
        System.out.println("Matrix elements are: ");
        for (int[] i : a) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    //    sc.close(); // Close the scanner to avoid resource leak
    }
}
