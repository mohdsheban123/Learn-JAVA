package Array;
import java.util.*;
public class Arrinput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       System.out.print("Enter the size of array="); 
        int n=sc.nextInt();
        int arr []= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Sum=" + sum);
        double avg=0;
       // for(int i=0;i<arr.length;i++)
        {
            avg=(double)sum/arr.length;
            System.out.println("Avg=" +avg);
        }
    }
}
