package Week3;

import java.util.Scanner;
import java.util.Arrays;

public class Reverse_An_Array {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element in The array");
        int n =sc.nextInt();
        int []arr=new int[n];
        int j=arr.length-1,temp;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
