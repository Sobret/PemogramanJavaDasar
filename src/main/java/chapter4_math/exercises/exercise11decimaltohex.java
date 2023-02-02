package chapter4_math.exercises;

import java.util.Scanner;

public class exercise11decimaltohex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt the user to enter an integer between 0 and 15
        System.out.println("enter a decimal value (0 to 15) : " );
        int decimal = input.nextInt();

        //display its corresponding hex number
        if(decimal >= 0 && decimal <= 9)
            System.out.println("the hax value is " + decimal);
        else if (decimal >= 10 && decimal <= 15)
            System.out.println("the hax value is " + (char)(decimal + 'A' - 10));
        else
            System.out.println(decimal + " is an invalid input");
    }
}
