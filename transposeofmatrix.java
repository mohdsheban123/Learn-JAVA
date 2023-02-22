package Array;
import java.util.*;
import java.lang.*;
import java.io.*;

public class transposeofmatrix

    {
        public static void main (String[] args) throws java.lang.Exception
        {
            //your code here
            Scanner sc=new Scanner (System.in);
            //  int m=sc.nextInt();
            int n=sc.nextInt();
            int mat[][]=new int[n][n];
            int sat[][]=new int[n][n];
            for(int i=0;i<mat.length;i++)
            {
                for(int j=0;j<mat[i].length;j++)
                {
                    mat[i][j]=sc.nextInt();
                }
            }
            //matrix transpose
            for(int i=0;i<mat.length;i++)
            {
                for(int j=0;j<mat[i].length;j++)
                {
                    sat[j][i]=mat[i][j];
                }
            }
            
          for(int i=0;i<mat.length;i++)
            {
                for(int j=0;j<mat[i].length;j++)
                {
                    System.out.print(sat[i][j] + " ");
                }
                System.out.println(" ");
            } 
        }
    }

