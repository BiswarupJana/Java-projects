package Week3;

import java.util.Scanner;

public class Sum_of_Odd_matrix {

    static void printOddSum(int [][]mat, int a, int b){
        int sum=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(mat[i][j]%2!=0){
                    sum+=mat[i][j];
                }
            }
        }
        System.out.println("Sum of odd : "+ sum);
    }
    public static void main(String[] args) {
        int i, j;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = s.nextInt();
        System.out.println("Enter number of Columns: ");
        int columns = s.nextInt();
        int[][] a = new int[rows][columns];
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                a[i][j] = s.nextInt();
            }
        }

        printOddSum(a, rows, columns);
    }
}
