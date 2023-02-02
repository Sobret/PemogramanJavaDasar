package chapter3_selec.exercises;

import java.util.Scanner;

public class exercise26usetheandoperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter an integer: ");
        int number = input.nextInt();

        System.out.println("is 10 divisible by 5 and 6? " +
                ((number % 5 == 0) && (number % 6 == 0)));
        System.out.println("is 10 divisible by 5 or 6? " +
                ((number % 5 == 0) || (number % 6 == 0)));
        System.out.println("is 10 devisible by 5 of 6, but not both? " +
                ((number % 5 == 0) ^ (number % 6 == 0)));
    }
}
