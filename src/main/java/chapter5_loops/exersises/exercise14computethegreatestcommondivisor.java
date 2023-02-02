package chapter5_loops.exersises;

import java.util.Scanner;
public class exercise14computethegreatestcommondivisor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        int gcd = n1 < n2 ? n1 : n2;

        while (n1 % gcd != 0 || n2 % gcd != 0) {
            gcd--;
        }

        System.out.println("The greatest common divisor for " + n1 +
                " and " + n2 + " is " + gcd);
    }
}
