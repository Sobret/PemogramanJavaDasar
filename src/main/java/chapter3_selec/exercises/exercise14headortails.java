package chapter3_selec.exercises;

import java.util.Scanner;

public class exercise14headortails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int coin = (int)(Math.random() * 2);

        System.out.println("enter a guess 0head or 1 tail: ");
        int guess = input.nextInt();

        System.out.println(((guess == coin) ? "correct" : "incorrect") + " guess.");
    }
}
