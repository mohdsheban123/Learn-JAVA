package Array;
public class array {
    public static void main(String[] args) 
    
    {
     System.out.println("this is a array progrm");
    int [] arr = new int[5];
    //int [] arr = {7,8,9,4,5,6};
    for (int i=0;i<arr.length;i++)
    {
     System.out.print(arr[i] + " ");   
    }
    System.out.println( );
     arr[3]=10;
     arr[2]=7;
     for(int i=0;i<arr.length;i++)
     {
        System.out.print(arr[i]+ " ");
     }
     int []brr = {1,1,2,3,4};
     System.out.println(brr.length);
     for(int i=0;i<brr.length;i++)
     {
        System.out.print(brr[i] + " ");
     }
    
}
}
