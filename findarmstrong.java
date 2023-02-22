// Java program to determine whether the number is
// Armstrong number or not
import java.util.*;
public class findarmstrong {
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     //int n = 153;
     int temp = n;
     int p = 0;
   
     /*function to calculate
     the sum of individual digits
     */
     while (n > 0) {
   
      int rem = n % 10;
      p = (p) + (rem * rem * rem);
      n = n / 10;
     }
   
     /* condition to check whether
     the value of P equals
     to user input or not. */
     if (temp == p) {
      System.out.println("Yes. It is Armstrong No.");
     }
     else {
      System.out.println("No. It is not an Armstrong No.");
     }
    }
   }
   