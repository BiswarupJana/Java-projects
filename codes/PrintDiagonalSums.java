package Week3;
import java.util.Scanner;

public class PrintDiagonalSums {
    public static void main(String[] args) {
        int i, j, sumL=0, sumR=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Size of array Matrix N X N :");
    int n =sc.nextInt();
    int arr[][]=new int[n][n];
     System.out.println("Enter the elements of matrix");
     for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
        }
     }
     
     System.out.println("The Matrix is :");
     for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            System.out.print(arr[i][j]+"\t");
        }
        System.out.println();
     }

     for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i==j){
                sumL+=arr[i][j];
            }
            else if(i+j==n-1){
                sumR+=arr[i][j];
            }
        }
     }

     System.out.println("Sum of left Diagonal : \n"+ sumL);
     System.out.println("Sum of right Diagonal : \n"+ sumR);
     
     
    }
}
