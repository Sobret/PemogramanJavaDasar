package chapter3_selec.exercises;

import java.util.Scanner;

public class exercise20windchilltempertur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the temperatur in fahrenheit " + "between -58F and 41F: ");
        double temperatur = input.nextDouble();
        System.out.println("enter the wind speed (>=2) in miles per hour: ");
        double speed = input.nextDouble();

        if(temperatur <= -58 || temperatur >= 41 || speed < 2)
        {
            System.out.println("the");
            if(temperatur <= -58 || temperatur >= 41)
                System.out.println("temperatur");
            if((temperatur <= -58 || temperatur >= 41) && speed < 2)
                System.out.println("and");
            if(speed < 2)
                System.out.println("wind speed");
            System.out.println("is invalid");
            System.exit(1);
        }

        double windchill = 35.74 + 0.6215 * temperatur - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temperatur * Math.pow(speed, 0.16);

        System.out.println("the wind chill index is " + windchill);
    }
}
