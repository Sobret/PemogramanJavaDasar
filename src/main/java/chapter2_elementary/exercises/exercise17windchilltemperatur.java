package chapter2_elementary.exercises;

import java.util.Scanner;

public class exercise17windchilltemperatur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the temperature in fahrenheit " + "between -58F and 41F: ");
        double temperature = input.nextDouble();
        System.out.println("enter the wind speed (>= 2) in miles per hour: ");
        double speed = input.nextDouble();

        double windchill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temperature * Math.pow(speed, 0.16);

        System.out.println("the wind chill index is " + windchill);
    }
}
