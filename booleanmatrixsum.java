package Array;
import java.util.*;
import java.lang.*;
import java.io.*;
public class booleanmatrixsum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                  Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int m=sc.nextInt();
                int [][]mat= new int [n][m];
                for(int i=0;i<n;i++)
                        {
                                for(int j=0;j<m;j++)
                                        {
                                                mat[i][j]=sc.nextInt();
                                        }
                       }
                for(int i=0;i<n;i++)
                        {
                                int flag=0;
                                for(int j=0;j<m;j++)
                                        {
                                                if(mat[i][j]==1)
                                                {
                                                        flag=1;
                                                        break;
                                                }
                                        }
                                if(flag==1)
                                {
                                        //all 1
                                        for(int j=0;j<m;j++)
                                                {
                                                        System.out.print(1+ " ");
                                                }
                                }
                                else{
                                        for(int j=0;j<m;j++)
                                                {
                                                        System.out.print(0 +" ");
                                                }
                                }
                         System.out.println();
                        }
	}
}