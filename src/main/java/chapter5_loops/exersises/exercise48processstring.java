package chapter5_loops.exersises;

import java.util.Scanner;
public class exercise48processstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = input.nextLine();

        String oddPositions = "";

        for (int i = 0; i < string.length(); i+=2) {
            oddPositions += string.charAt(i);
        }

        System.out.println(oddPositions);
    }
}
