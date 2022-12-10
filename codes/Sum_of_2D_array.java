
package Week3;

import java.util.Scanner;

public class Sum_of_2D_array {
    public static void main(String[] args) {
        int i, j;
        Scanner s = new Scanner(System.in);
    System.out.println("Enter number of rows: ");
    int rows =s.nextInt();
    System.out.println("Enter number of Columns: ");
    int columns=s.nextInt();
    int [][]a=new int [rows] [columns];
    int [][]b=new int [rows] [columns];
    for (i=0;i<rows;i++){
        for(j=0;j<columns;j++){
            a[i][j]=s.nextInt();
        }
    }
    for ( i=0;i<rows;i++){
        for(j=0;j<columns;j++){
            b[i][j]=s.nextInt();
        }
    }
    int [][]c=new int[rows][columns];
    for ( i=0;i<rows;i++){
        for(j=0;j<columns;j++){
            c[i][j]=a[i][j]+b[i][j];
        }
    }
    System.out.println("The sum of the two matrics is ");
    for ( i=0;i<rows;i++){
        for(j=0;j<columns;j++){
            System.out.print(c[i][j]+" ");
        }
        System.out.println();
    }
    }
    
}
