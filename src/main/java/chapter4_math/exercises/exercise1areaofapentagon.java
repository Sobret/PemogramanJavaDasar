package chapter4_math.exercises;

import java.util.Scanner;

public class exercise1areaofapentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt the use to enter the length from
        //the center of a pentegon to a vertex
        System.out.print("enter the length from the center to a vartex: ");
        double r = input.nextDouble();

        //compute the of the pentagon
        double s = (2 * r) * Math.sin(Math.PI / 5); //length of a side
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

        //display results
        System.out.printf("the area of the pentagon is %5.2f\n", area);
    }
}
