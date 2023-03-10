package chapter6_methods.exercises;
import java.util.Scanner;
public class exercise37formataninteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number and its width: ");
        int number = input.nextInt();
        int width = input.nextInt();

        System.out.println(
                number + " formatted to width " + width + ": " + format(number, width));
    }

    public static String format(int number, int width) {
        String num = number + "";

        if (num.length() < width) {
            for (int i = width - num.length(); i > 0; i--) {
                num = 0 + num;
            }
        }
        return num;
    }
}
