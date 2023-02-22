package Array;

import java.util.Scanner;

public class subarraysumdivisblebyk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int prefix[]=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;++i)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }
        int count=0;
        for(int i=0;i<n;++i)
        {
            for(int j=1;j<n;++j)
            {
                int sum=0;
                if(i==0)
                {
                    sum=prefix[j];
                }
                else 
                {
                    sum=prefix[j]-prefix[i-1];
                }
                if (sum%k==0) ++count;
            }
        }
        System.out.println(count);

    }
}
