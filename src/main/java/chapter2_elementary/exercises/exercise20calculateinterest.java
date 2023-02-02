package chapter2_elementary.exercises;

import java.util.Scanner;

public class exercise20calculateinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter balance interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double annualinterestrate = input.nextDouble();

        double interest = balance * (annualinterestrate / 1200);

        System.out.println("enter interest is " + interest);
    }
}
