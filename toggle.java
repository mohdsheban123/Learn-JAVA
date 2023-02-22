import java.util.*;
public class toggle {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        String s = sc.nextLine();
        char []arr =s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            char curr=arr[i];
            if(curr>='A' && curr<='Z')
            {
                char toggle=(char)(curr + 'a'-'A');
                arr[i]=toggle;
            }
            else  if(curr>='a' && curr<='z')
            {
                char toggle=(char)(curr - ('a'-'A'));
                arr[i]=toggle;
            }
        }
        String ans=new String (arr);
        System.out.println(ans);
    }
}