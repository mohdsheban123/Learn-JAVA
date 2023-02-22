package Array;
import java.util.*;

public class calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter Size of Numbers");
        int n=sc.nextInt();
        System.out.println("Enter Values of array "+n);
       
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]);
    }
    int sum=0,mul=0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    System.out.print("Addition ="+ sum);
    for(int i=0;i<n;i++){
        mul=arr[i]*arr[i+1];
    }
    System.out.print("Multy ="+ mul);


    }
}
