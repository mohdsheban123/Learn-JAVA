package Array;
import java.util.*;
public class twodarray {
 
    public static void main(String[] args)
     {
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [][]mat= new int[m][n];

        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
               mat[i][j]=sc.nextInt();
            }
           // System.out.println();
        }
        System.out.println("MATRIX=");
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
               System.out.print(mat[i][j]+ " ");
            }
           System.out.println();
        }    
        int sum=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
               sum+=mat[i][j];
            }
        }    
        System.out.println("Sum of Matrix:"+ sum);
        int sum1=0;
        for(int i=0;i<mat.length;i++)
        {
        for(int j=0;j<mat.length;j++)
        {
            if(i==j)
            {
                sum1+=mat[i][j];
            }
        }
        }
        System.out.println("Princip;e sum:"+sum1);
       
    }
}

