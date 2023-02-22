package Array;
import java.util.Scanner;

public class largestelementtwiceofother {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int lar=arr[0];
        int idx=0;
        for(int i=1;i<n;++i)
        {
            if(arr[i]>lar){
            lar=arr[i];
            idx=i;
            }
        }
        for(int i=0;i<n;++i)
        {
            if(arr[i]!=lar && 2*arr[i]>lar)
            {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(idx);
    }
}
