package Array;
import java.util.*;
public class avg
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
      Scanner sc= new Scanner(System.in);
      int n =sc.nextInt();
      int []arr= new int[n];
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
      int sum=0;
      for(int i=0; i<arr.length;i++)
        {
          sum+=arr[i];
        }
        int avg=sum/arr.length;
      System.out.println(avg);
	}
}