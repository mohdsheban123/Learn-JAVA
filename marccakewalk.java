package Array;

import java.util.Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;

public class marccakewalk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []cal=new int[n];
        for(int i=0;i<n;++i)
        {
            cal[i]=sc.nextInt();
        }
        Arrays.sort(cal);
        long j=0;
        long miles=0;
        for(int i=n-1;i>=0;--i)
        {
            miles+=cal[i]*Math.pow(2, j);
            ++j;
        }
        System.out.println(miles);
    }
}
