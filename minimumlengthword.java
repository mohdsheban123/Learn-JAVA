import java.util.*;
import java.lang.*;
import java.io.*;

public class minimumlengthword
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc=new Scanner(System.in);
                String s=sc.nextLine();
                s=s.trim();
                String []ret=s.split(" ");
                int minlen=s.length();
                for(int i=0;i<ret.length;i++)
                        {
                                if(ret[i].length()<minlen)
                                {
                                        minlen=ret[i].length();
                                }
                        }
                for(int i=0;i<ret.length;i++)
                        {
                                if(ret[i].length()==minlen)
                                {
                                        System.out.println(ret[i]);
                                        return;
                                }
                        }            
	}
}