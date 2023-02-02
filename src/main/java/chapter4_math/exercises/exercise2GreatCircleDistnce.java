package chapter4_math.exercises;

import java.util.Scanner;

public class exercise2GreatCircleDistnce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double RADIUS = 6371.01;  //Costant value

        //prompt the user to enter the latitude and longitude
        //of two points on the earth in degrees
        System.out.println("enter point 1 (latitude and longitude) in degrees: ");
        String xy1 = input.nextLine();
        System.out.println("enter point 2 (latitude and longitude) in degress: ");
        String xy2 = input.nextLine();

        //extract x and y value from string
        int k = xy1.indexOf(',');
        double x1 = Double.parseDouble(xy1.substring(0, k - 1));
        double y1 = Double.parseDouble(xy1.substring(k + 2));
        k = xy2.indexOf(',');
        double x2 = Double.parseDouble(xy2.substring(0, k - 1));
        double y2 = Double.parseDouble(xy2.substring(k + 2));

        //convert degrees to radians
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        //calculate its great circle distance
        double distance =
                RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) +
                Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        //display result
        System.out.println("the distance between the two points is " + distance);
    }
}
