package Array;
import java.util.*;
import java.lang.*;
import java.io.*;
public class secondlargestarray {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max1= Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=max1)
            {
            max2=max1;
            max1=arr[i];
            }
            else if(arr[i]>=max2)
            {
                max2=arr[i];
            }
        }
        int ans=(max1-1)*(max2-1);
        System.out.println(ans);
    }
}
