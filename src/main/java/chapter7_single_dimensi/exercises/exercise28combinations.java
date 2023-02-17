package chapter7_single_dimensi.exercises;

import java.util.Scanner;

public class exercise28combinations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] number = new int[10];

        System.out.println("enter ten numbers: ");
        for (int i = 0; i < number.length; i++)
            number[i] = input.nextInt();

        printCombinations(number);
    }
    public static void printCombinations(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j)
                    System.out.println(numbers[i] + " " + numbers[j]);
            }
        }
    }
}
