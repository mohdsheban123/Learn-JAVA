import java.util.Scanner;//Importing the packages in the program.

public class month {
    
    public static void main(String[] args) {
        //Declaring the required variables for the program.
        int mth;
        try (Scanner sc = new Scanner(System.in)) {
            //Taking the input month number from the user.
            System.out.println("Enter Month number (1-12) : ");
            mth = sc.nextInt();
        }
        //Finding the Month of the year.
        if(mth == 1) {
            //Printing the Month of the year 
            System.out.println("January");

        } else if(mth == 2) {
            //Printing the Month of the year 
            System.out.println("February");

        } else if(mth == 3) {
            //Printing the Month of the year 
            System.out.println("March");

        } else if(mth == 4) {
            //Printing the Month of the year 
            System.out.println("April");

        } else if(mth == 5) {
            //Printing the Month of the year 
            System.out.println("May");

        } else if(mth == 6) {
            //Printing the Month of the year 
            System.out.println("june");

        } else if(mth == 7) {
            //Printing the Month of the year 
            System.out.println("July");

        } else if(mth == 8) {
            //Printing the Month of the year 
            System.out.println("August");

        } else if(mth == 9) {
            //Printing the Month of the year 
            System.out.println("September");

        } else if(mth == 10) {
            //Printing the Month of the year 
            System.out.println("October");

        } else if(mth == 11) {
            //Printing the Month of the year 
            System.out.println("November");

        } else if(mth == 12) {
            //Printing the Month of the year 
            System.out.println("December");

        } else {
            //Printing the message to enter month number between 1-12
            System.out.println("Please enter month number between 1-12.");
        }

    }
}