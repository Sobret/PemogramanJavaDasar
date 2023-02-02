package chapter2_elementary.exercises;

import java.util.Scanner;

public class exercise21calculatefutureinvestment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter invesment amoun: ");
        double amount = input.nextDouble();
        System.out.println("enter anual interest rate in percentage: ");
        double monthlyinterestrate = input.nextDouble();
        monthlyinterestrate /= 1200;
        System.out.println("enter number of years: ");
        int years = input.nextInt();

        double futureinvesmentvalue = amount * Math.pow(1 + monthlyinterestrate, years * 12);

        System.out.println("accumulated value is $" + futureinvesmentvalue);

    }
}
