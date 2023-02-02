package chapter3_selec.exercises;

import java.util.Scanner;

public class exercise23poininarectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        boolean withinrectangle = (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2) || (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);

        System.out.println("points (" + x + "," + y + ") is " + ((withinrectangle) ? "im": "not in") + "the rectangle");
    }
}
