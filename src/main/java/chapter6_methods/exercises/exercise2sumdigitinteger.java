package chapter6_methods.exercises;

import java.util.Scanner;

public class exercise2sumdigitinteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a integer : ");
        long number = input.nextLong();

        System.out.println("the sum of the digits in " + number + " is " +
                sumDigits(number));
    }
    public static long sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
