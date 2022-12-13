package Week3;

import java.util.Scanner;

public class Transpose_Matrix {
    public static void main(String[] args) {
        int i, j;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = s.nextInt();
        System.out.println("Enter number of Columns: ");
        int columns = s.nextInt();
        int[][] a = new int[rows][columns];
        int[][] b = new int[columns][rows];
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                a[i][j] = s.nextInt();
            }
        }

        // for(i=0;i<rows;i++){
        //     for(j=0;j<columns;j++){
        //         b[i][j]=a[j][i];
        //     }
        // }
        
        System.out.println("Result matrix is \n");

        for(i=0;i<columns;i++){
            for(j=0;j<rows;j++){
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }

        
    }

}
