    import java.util.*;
    public class temprature
    {
    public static void main (String [] args) 
    {
        try (Scanner sc = new Scanner (System.in)) 
        {
            System.out.print("Enter the Farenhiet Temprature Value=");
            int tempC = sc.nextInt();
            int tempF=tempC*9/5+32;
            //System.out.println("Enter the Farenhiet Temprature Value="+tempC);
            System.out.println("Celsius temprature is="+tempF);
        }
    
    }
    }

