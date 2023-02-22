package Array;
import java.util.*;;

public class peak {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }    
        if(n==1)
        {
            System.out.println(0);
            return;
        }
        for(int i=0;i<n;++i)
         {
            if(i==0)
            {
             if(arr[i]>arr[i+1])
              {
                System.out.println(i);
                return;
              }
            } 
         else if(i==n-1)
         {
          if(arr[i]>arr[i-1])
         {
           System.out.println(i);
           return;
         }
         }
        else  
        {
            if(arr[i]>arr[i+1] && arr[i]>arr[i-1])
           {
             System.out.println(i);
             return;
           }
        }
    }
    System.out.println(-1);
}
}
