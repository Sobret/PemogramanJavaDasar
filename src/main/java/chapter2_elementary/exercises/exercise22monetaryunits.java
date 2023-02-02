package chapter2_elementary.exercises;

import java.util.Scanner;

public class exercise22monetaryunits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter an amount as integer, for example 1156 for 11.56: ");
        int amount = input.nextInt();

        int remainingAmount = amount;

        int numberofonedollars = remainingAmount / 100;
        remainingAmount %= 100;

        int numberofquarters = remainingAmount / 25;
        remainingAmount %= 25;

        int numberofdimes = remainingAmount / 10;
        remainingAmount %= 10;

        int numberofnickels = remainingAmount / 5;
        remainingAmount %= 5;

        int numberofpennies = remainingAmount;

        System.out.println("your amount " + amount / 100.0 + " consists of");
        System.out.println(" " + numberofonedollars + " dollars");
        System.out.println(" " + numberofquarters + " quarters");
        System.out.println(" " + numberofdimes + " dimes");
        System.out.println(" " + numberofnickels + " nickels");
        System.out.println(" " + numberofpennies + " pennies");
    }
}
