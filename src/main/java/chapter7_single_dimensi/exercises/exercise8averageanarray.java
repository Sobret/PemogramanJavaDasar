package chapter7_single_dimensi.exercises;

import java.util.Scanner;

public class exercise8averageanarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] values = new double[10];
        System.out.println("enter ten values of double type: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }
        System.out.println("the average value: " + average(values));
    }
    public static int average(int[] array) {
        int average = 0;
        for (int i: array)
            average += i;
        return average / array.length;
    }
    public static double average(double[]array) {
        double average = 0;
        for (double i: array)
            average += i;
        return average / array.length;
    }
}
