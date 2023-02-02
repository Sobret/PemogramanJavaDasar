package chapter4_math.exercises;

import java.util.Scanner;

public class exercise22checksubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt the user to entertwo strings
        System.out.println("enter string s1: ");
        String string1 = input.nextLine();
        System.out.println("enter string2: ");
        String string2 = input.nextLine();

        //display wheater the second string
        //is a substring of the frist string
        System.out.println(
                string2 + ((string1.contains(string2)) ? " is " : " is not ") +
                        "a substring of " + string1);

    }
}
