package chapter3_selec.latihan;
import java.util.Scanner;
public class listing6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter an integer : ");
        int number = input.nextInt();

        if (number % 2 == 0 && number % 3 == 0)
            System.out.println(number + " is divisble by 2 or 3.");

        if (number % 2 == 0 ^ number % 3 == 0)
            System.out.println(number + " is divosible by 2 or 3, but not both.");
    }
}
