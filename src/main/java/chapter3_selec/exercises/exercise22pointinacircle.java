package chapter3_selec.exercises;

import java.util.Scanner;

public class exercise22pointinacircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        boolean withincircle = (Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10);

        System.out.println("point (" + x + "," + y + ") is " + ((withincircle) ? "in" : "not in") + "the circle");
    }
}
