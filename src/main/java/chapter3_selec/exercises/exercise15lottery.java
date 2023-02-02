package chapter3_selec.exercises;

import java.util.Scanner;

public class exercise15lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lottery = (int) (Math.random() * 1000);

        System.out.println("enter a three digit number: ");
        int guess = input.nextInt();

        int lotterydigit1 = lottery / 100;
        int remainingdigits = lottery % 100;
        int lotterydigit2 = remainingdigits / 10;
        int lotterydigit3 = remainingdigits % 10;

        int guessdigit1 = guess / 100;
        int remainingdigit = guess % 100;
        int guessdigit2 = remainingdigits / 10;
        int guessdigit3 = remainingdigits % 10;

        System.out.println("the lottery number is " + lottery);

        if (guess == lottery)
            System.out.println("exact match: you win $10,000");
        if (guessdigit1 == lotterydigit2)
        {

        }

    }
}
