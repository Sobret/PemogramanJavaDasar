package chapter4_math.exercises;

import java.util.Scanner;

public class exercise5arearegularpolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the number of sides
        //and their length of a regular polygon
        System.out.print("enter the number of sides: ");
        int numberOfSides = input.nextInt();
        System.out.print("enter the side: ");
        double side = input.nextDouble();

        //compute the area of a regular polygon
        double area = (numberOfSides * Math.pow(side, 2) /
                (4 * Math.tan(Math.PI / numberOfSides)));

        //display result
        System.out.println("the area of the polygon is " + area);
    }

}
