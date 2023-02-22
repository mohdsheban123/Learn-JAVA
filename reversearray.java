package Array;
import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr []= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        
        }
      // int f=arr.length;
       int i=0;
       int j=n-1;
       while(i<j)
       {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
       }
       for(i=0;i<n;i++)
       {
        System.out.print(arr[i] +" ");
       }

    }
}
