package Array;

import java.util.Scanner;

public class revise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            System.out.print(arr[i]+" ");
            
        }
        for(int i=n-1;i>=n;i--){
          //  arr[i]=sc.nextInt();
            System.out.print(arr[i]+" ");
            
        }
    }
}
