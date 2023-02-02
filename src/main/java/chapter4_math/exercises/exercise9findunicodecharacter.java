package chapter4_math.exercises;

import java.util.Scanner;

public class exercise9findunicodecharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a character
        System.out.println("enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(0);

        //display unicode of character
        System.out.println((int)ch);
    }
}
