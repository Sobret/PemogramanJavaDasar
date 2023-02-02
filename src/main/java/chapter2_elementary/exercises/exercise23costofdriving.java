package chapter2_elementary.exercises;

import java.util.Scanner;

public class exercise23costofdriving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.println("enter milles per gallon");
        double millespergallon = input.nextDouble();
        System.out.println("enter price per gallon");
        double princepergallon = input.nextDouble();

        double costofdriving = (distance / millespergallon) * princepergallon;

        System.out.println("the cost of driving is $" + costofdriving);

    }
}
