package chapter3_selec.exercises;

import java.util.Scanner;

public class exercise27pointsintriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double intersectx = (-x * (200 * 100)) / (-y * 200 - x * 100);
        double intersecty = (-y * (200 * 100)) / (-y * 200 - x * 100);

        System.out.println("the point " + ((x > intersectx || y > intersecty) ? "is not" : "is") + "in the triangle");
    }
}
