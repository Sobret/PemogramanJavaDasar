package chapter4_math.exercises;

import java.util.Scanner;

public class exercise8findcharacterASCII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt the user to enter an ASCII code
        //(an integer between 0 and 127)
        System.out.println("enter an ASCII code: ");
        int i = input.nextInt();

        //display ASCII code as character
        System.out.println((char)i);
    }
}
