package Week3;

import java.util.Scanner;

public class Sum_Even_Array {
    public static void main(String[] args) {
        int i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element in The array");
        int n =sc.nextInt();
        int []arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(i=0;i<n;i++){
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        System.out.println("Sum is : "+ sum);
    }
    
}
