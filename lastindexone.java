package Array;
import java.util.*;
import java.lang.*;
import java.io.*;

public class lastindexone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc=new Scanner(System.in);
                String s=sc.next();
                int ans=lastIndex(s);
                System.out.println(ans);
	}
        public static int lastIndex(String s)
        {
                for(int i=s.length()-1;i>=0;i--)
                        {
                        if(s.charAt(i)=='1')
                        {
                                return i;
                        }
                        }
                return -1;
        }
}