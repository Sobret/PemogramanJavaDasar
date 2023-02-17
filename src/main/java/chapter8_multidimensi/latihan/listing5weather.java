package chapter8_multidimensi.latihan;

import java.util.Scanner;

public class listing5weather {
    public static void main(String[] args) {
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;
        double[][][] data
                = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

        Scanner input = new Scanner(System.in);

        for (int k = 0; k < NUMBER_OF_DAYS * NUMBER_OF_HOURS; k++) {
            int day = input.nextInt();
            int hour = input.nextInt();
            double temperrathure = input.nextDouble();
            double humidity = input.nextDouble();
            data[day - 1][hour - 1][0] = temperrathure;
            data[day - 1][hour - 1][0] = humidity;
        }
        for (int i = 0; i < NUMBER_OF_DAYS; i++) {
            double dailyTemperrathureTotal = 0, dailyHumidityTotal = 0;
            for (int j = 0; j < NUMBER_OF_HOURS; j++) {
                dailyTemperrathureTotal += data[i][j][0];
                dailyHumidityTotal += data[i][j][1];
            }
            System.out.println("day " + i + " s average temperathure is "
            + dailyTemperrathureTotal / NUMBER_OF_HOURS);
            System.out.println("day " + i + " s average hunidity is "
            + dailyHumidityTotal / NUMBER_OF_DAYS);
        }
    }
}
