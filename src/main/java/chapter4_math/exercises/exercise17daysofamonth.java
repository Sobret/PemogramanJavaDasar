package chapter4_math.exercises;

import java.util.Scanner;

public class exercise17daysofamonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a year and
        //the first three letter of a month name
        System.out.println("enter a year: ");
        int year = input.nextInt();
        System.out.println("enter a month: ");
        String month = input.next();

        //test for leaf year
        boolean leapyear =
                ((year %4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        //display the number of day in the month
        System.out.print(month +" " + year +" has ");

        if(month.equals("jan") || month.equals("mar") ||
                 month.equals("may") || month.equals("jul") ||
                 month.equals("aug") || month.equals("oct") ||
                month.equals("dec"))
               System.out.println(31 + " days ");
        else if (month.equals("apr") || month.equals("jun") ||
               month.equals("sep") || month.equals("nov"))
            System.out.println(30 + " days ");
        else
            System.out.println(((leapyear) ? 29 : 28) + " days ");


    }
}



