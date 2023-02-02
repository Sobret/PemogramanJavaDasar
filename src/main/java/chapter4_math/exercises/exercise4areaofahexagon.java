package chapter4_math.exercises;

import java.util.Scanner;

public class exercise4areaofahexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the side of hexagon
        System.out.print("enter the side : ");
        double s = input.nextDouble();

        //compute the area of a hexagon
        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

        //display result
        System.out.printf("the area of the hexagon is %4.2f\n", area);
    }
}
