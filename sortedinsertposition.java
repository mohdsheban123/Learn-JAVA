package Array;

import java.util.Scanner;

public class sortedinsertposition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=b)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println(n);
    }
}
