package Week3;

import java.util.Scanner;
import java.util.Arrays;
public class Linear_search {
    public static int search(int arr[], int x){
        int n =arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element in The array");
        int n =sc.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the number ");
        int m=sc.nextInt();
        int result=search(a, m);
        if(result==-1){
            System.out.println("not available");
        }
        else {
            System.out.println("Index position is " +result);
        }
    }
}
