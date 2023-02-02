package chapter4_math.exercises;

import java.util.Scanner;

public class exercise23payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt the user to enter payroll inforation
        System.out.println("enter employee's name: ");
        String name = input.next();
        System.out.println("enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();
        System.out.println("enter hourly pay rate: ");
        double hourlyPayRate = input.nextDouble();
        System.out.println("enter federal tax withholding rate: ");
        double federalTaxRate = input.nextDouble();
        System.out.println("enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();


        //display payroll statement
        double grosspay, federal, state, totaldeduction;
        System.out.printf(
                "Employee Name: " + name +
                        "\nHours Worked: " + hoursWorked +
                        "\nPay Rate: $" + hourlyPayRate +
                        "\nGross Pay: $" + (grosspay = hoursWorked * hourlyPayRate) +
                        "\nDeductions:\n   Federal Witholding (20.0%): $" +
                        (federal = grosspay * federalTaxRate) +
                        "\n   State Witholding (9.0%): $" + (state = grosspay * stateTaxRate) +
                        "\n   Total Deduction: $" + (totaldeduction = federal + state) +
                        "\nNet Pay: $" + (grosspay - totaldeduction)
                          );
    }
}
