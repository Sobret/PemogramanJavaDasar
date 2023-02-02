package chapter3_selec.exercises;

import java.util.Scanner;

public class exercise9checkISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the first 9 digits of an isbn as integer: ");
        int isbn = input.nextInt();

        int d1 = isbn / 100000000;
        int remainingdigits = isbn % 100000000;
        int d2 = remainingdigits / 10000000;
        remainingdigits %= 10000000;
        int d3 = remainingdigits / 1000000;
        remainingdigits %= 1000000;
        int d4 = remainingdigits / 100000;
        remainingdigits %= 100000;
        int d5 = remainingdigits / 10000;
        remainingdigits %= 10000;
        int d6 = remainingdigits / 1000;
        remainingdigits %= 1000;
        int d7 = remainingdigits / 100;
        remainingdigits %= 100;
        int d8 = remainingdigits / 10;
        remainingdigits %= 10;
        int d9 = remainingdigits;

        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        System.out.println("the isbn-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);
        if (d10 == 10)
            System.out.println("x");
        else
            System.out.println(d10);
    }
}
