import java.util.*;
import java.lang.*;
import java.io.*;

public class colsumrowsum
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        f(mat);
    }
    public static void f(int mat[][])
    {
        int n=mat.length;
        for(int i=0;i<n;i++)
        {
            int rowsum=0, colsum=0;
            for(int j=0;j<n;j++)
            {
                rowsum+=mat[i][j];
                colsum+=mat[j][i];
            }
            System.out.println(colsum-rowsum);
        }
    }
}