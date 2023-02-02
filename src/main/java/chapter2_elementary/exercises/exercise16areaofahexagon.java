package chapter2_elementary.exercises;

import java.util.Scanner;

public class exercise16areaofahexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the side: ");
        double side = input.nextDouble();

        double area = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(side, 2);

        System.out.println("the area of the hexagon is " + area);
    }
}
