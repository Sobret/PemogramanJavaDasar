package chapter3_selec.exercises;

import java.util.Scanner;

public class exercise10additionquiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        System.out.println("what is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        if(number1 + number2 == answer)
            System.out.println("you are correct!");
        else
            System.out.println("tou are wrong " + number1 + " + " + number2 + " should be " + (number1 + number2));

    }
}
