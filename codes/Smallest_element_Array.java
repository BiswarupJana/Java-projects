package Week3;

import java.util.Scanner;

public class Smallest_element_Array {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element in The array");
        int n =sc.nextInt();
        int []arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int min=arr[0];
        for(i=1;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Min element is: "+ min);

    }
}
