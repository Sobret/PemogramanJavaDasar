package chapter12_exception_handling_taxt.latihan;
import java.util.*;
public class listing5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("enter an integer: ");
                int number = input.nextInt();

                System.out.println("the number entered is " + number);

                continueInput = false;
            }
            catch (InputMismatchException ex) {
                System.out.println("try again. (" + "incorrect input: an integer is required)");
                input.nextLine();
            }
        } while (continueInput);
    }
}
