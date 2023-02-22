package Array;
import java.util.Scanner;

public class chesssum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]mat=new int[n][n];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        int blacksum=0;
        int whitesum=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if((i+j)%2==0)
                {
                    blacksum+=mat[i][j];
                }
                else{
                    whitesum+=mat[i][j];
                }
            }
        }
        System.out.println(blacksum);
        System.out.println(whitesum);
        
    }
}
