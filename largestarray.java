package Array;
public class largestarray {
    public static void main(String[] args) {
        int arr[]={2,6,6,4,8,9,12,78,90};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
