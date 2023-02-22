package Array;
import java.util.*;
public class fractionarr
{
  
    public static void main(String[] args) 
    {
    System.out.print("enter array= ");    
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int [] arr=new int[n];
     for(int i=0;i<arr.length;i++)
     {
        arr[i]=sc.nextInt();
     }
     System.out.print("Array is= ");
     for(int i=0;i<arr.length;i++)
     {
         System.out.print(arr[i]+ " ");
     }
     System.out.println();
     int Neg=0;
     int Pos=0;
     int zero=0;
     for (int i=0;i<arr.length;i++)
     {
        if (arr[i] == 0)
        {
            zero++;
        }
        else 
        if(arr[i] > 0)
        {
        Pos++;
        }
        else
        {
            Neg++;
        }

     }
     System.out.println("Zero=" + zero);
     System.out.println("Posive=" + Pos);
     System.out.println("Negative=" + Neg);

    }
}