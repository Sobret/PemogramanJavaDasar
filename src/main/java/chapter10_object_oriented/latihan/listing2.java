package chapter10_object_oriented.latihan;

import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYear;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan() {
        this(2.5, 1, 1000);
    }
    public Loan(double annualInterestRate, int numberOfYear, double loanMount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYear = numberOfYear;
        this.loanAmount = loanMount;
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYear() {
        return numberOfYear;
    }

    public void setNumberOfYear(int numberOfYear) {
        this.numberOfYear = numberOfYear;
    }

    public double getLoanMount() {
        return loanAmount;
    }

    public void setLoanMount(double loanMount) {
        this.loanAmount = loanMount;
    }
    public double getMonthlyPayment() {
        double montehlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * montehlyInterestRate / (1-
                (1 / Math.pow(1 + montehlyInterestRate, numberOfYear * 12)));
        return monthlyPayment;
    }
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYear * 12;
        return totalPayment;
    }
    public java.util.Date getLoanDate() {
        return loanDate;
    }

}
