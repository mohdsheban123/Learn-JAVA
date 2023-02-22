package Array;
import java.util.*;
import java.lang.*;
import java.io.*;

public class facingthesun
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      int []arr= new int[n];
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      int count=1;
      int lar=arr[0];
      for(int i=0;i<n;i++)
        {
          if(arr[i]>lar)
          {
            count++;
            lar=arr[i];
          }
        }
      System.out.println(count);
	}
}