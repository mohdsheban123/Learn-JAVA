package Array;
import java.util.*;
import java.lang.*;
import java.io.*;

public class angryprof
{
	public static void main (String[] args) throws java.lang.Exception
	{
       Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
      while (t-->0)
        {
          int n=sc.nextInt();
          int k=sc.nextInt();
          int []arr=new int [n];
          int count=0;
          for(int i=0;i<n;++i)
            {
              arr[i]=sc.nextInt();
              if(arr[i]<=0)
              {
                count++;
              }
            }
          if(count>=k)
          {
            System.out.println("NO");
          }
          else System.out.println("YES");
          
        }
	}
}