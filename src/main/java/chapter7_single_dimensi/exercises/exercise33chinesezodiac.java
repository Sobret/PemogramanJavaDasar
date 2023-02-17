package chapter7_single_dimensi.exercises;

import java.util.Scanner;

public class exercise33chinesezodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] zodiacs = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};

        System.out.println("enter a year: ");
        int year = input.nextInt();

        System.out.println(zodiacs[year % 12]);
    }
}
