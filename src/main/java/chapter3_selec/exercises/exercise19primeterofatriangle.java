package chapter3_selec.exercises;

import java.util.Scanner;

public class exercise19primeterofatriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter three edges for a triangle: ");
        System.out.println("edge 1 points x, y: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("edge 2 points x, y: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.println("edge 3 points x, y: ");
        double x3 = input.nextDouble();
        Double y3 = input.nextDouble();

        boolean valid = (x1 + y1 > x3 + y3 && x2 + y2 > x3 + y3) || (x1 + y1 > x2 + y2 && x3 + y3 > x2 + y2) || (x3 + y3 > x1 + y1 && x2 + y2 > x1 + y1);
        if(!valid)
        {
            System.out.println("input is invalid.");
            System.exit(1);
        }

        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

        System.out.println("primeter of triangle is " + (side1 + side2 + side3));

    }
}
