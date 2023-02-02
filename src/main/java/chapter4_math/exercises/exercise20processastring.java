package chapter4_math.exercises;

import java.util.Scanner;

public class exercise20processastring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a string
        System.out.println("enter a sting: ");
        String str = input.nextLine();

        //display the string's length and its first character
        System.out.println(str + " has s length of " + str.length() +
                " and its first character is " + str.charAt(0));
    }
}
