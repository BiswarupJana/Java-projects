package Week3;

import java.util.Scanner;

public class Sparse_matrix {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");

        int rows = sc.nextInt();
        System.out.println("Enter number of Columns: ");

        int columns = sc.nextInt();
        double a[][] = new double[rows][columns];
        int zeros = 0;
        System.out.println("Enter The Matrix ");

        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] == 0) {
                    zeros++;
                }
            }
        }

        if (zeros > (rows * columns) / 2) {
            System.out.println("It's a Sparse matrix");
        } else {
            System.out.println("Not a Sparse Matrix");
        }
        sc.close();
    }

}
