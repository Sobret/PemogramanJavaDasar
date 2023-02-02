package chapter3_selec.exercises;

import java.util.Scanner;

public class exercise21dayoftheweek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter year : (e.g., 2012): ");
        int year = input.nextInt();
        System.out.println("enter month: 1-12: ");
        int month = input.nextInt();
        System.out.println("enter the day of the month: 1-31: ");
        int dayofmonth = input.nextInt();

        if(month == 1 || month == 2)
        {
            month = (month == 1) ? 13 : 14;
            year--;
        }

        int dayofweek = (dayofmonth + (26 * (month + 1)) / 10 + (year % 100) + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;

        System.out.println("day of the week is");
        switch (dayofweek)
        {
            case 0: System.out.println("saturday"); break;
            case 1: System.out.println("sunday"); break;
            case 2: System.out.println("monday"); break;
            case 3: System.out.println("tuesday"); break;
            case 4: System.out.println("wednesday"); break;
            case 5: System.out.println("thursday"); break;
            case 6: System.out.println("friday"); break;
        }
    }
}
