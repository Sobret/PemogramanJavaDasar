package chapter6_methods.exercises;

import java.util.Scanner;
public class exercise22approximatethesquareroot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextLong();

        System.out.println(
                "The approximated square root of " + number + " is: " + sqrt(number));
    }

    public static double sqrt(long n) {
        long lastGuess = 1;	// Initial guess to positive value
        long nextGuess = (lastGuess + n / lastGuess) / 2;

        while (nextGuess - lastGuess > 0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }
        lastGuess = nextGuess;
        return nextGuess = (lastGuess + n / lastGuess) / 2;
    }
}
