package Week3;

import java.util.Arrays;
import java.util.Scanner;

public class Range_1D_Array {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element in The array");
        int n =sc.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the range");
        int p=sc.nextInt();
        int q=sc.nextInt();
        int [] range=Arrays.copyOfRange(a, p, q);
        int r=Math.abs(p-q);
        System.out.println("new array elements:\n");
        for(i=0;i<r;i++){
            System.out.print(range[i]+", ");
        }

    }
    
}
