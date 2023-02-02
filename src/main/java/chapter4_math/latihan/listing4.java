package chapter4_math.latihan;
import java.util.Scanner;
public class listing4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("Enter a hex digit: ");
         String hexString = input.nextLine();

         if (hexString.length() != 1) {
             System.out.println("You must enter exactly one character");
             System.exit(1);
             }

         char ch = Character.toUpperCase(hexString.charAt(0));
         if ('A' <= ch && ch <= 'F') {
             int value = ch - 'A' + 'F';
             System.out.println("The decimal value for hex digit "
                     + ch + " is " + value);
             }
         else if (Character.isDigit(ch)) {
             System.out.println("The decimal value for hex digit "
                     + ch + " is " + ch);
             }
         else {
             System.out.println(ch + " is an invalid input");
         }
    }
}
