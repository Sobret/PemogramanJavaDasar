package chapter10_object_oriented.latihan;

import chapter11_inheri_polymorphism.exercise.Loan;

import java.util.Scanner;

public class listing1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("enter number of year as an integer : ");
        int numberOfYear = input.nextInt();

        System.out.print("enter loan amount, for example, 120000.95: ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYear, loanAmount);

        System.out.printf("the loan was created on %s\n" + "the monthly payment is %.2f\nthe total payment is %.2f\n",
                loan.getLoanDate().toString(), loan.getMonthlyPayment(),
                loan.getTotalPayment());
    }
}
