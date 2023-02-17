package chapter7_single_dimensi.exercises;

import java.util.Scanner;

public class exercise10smallestelement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.println("enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();

        System.out.println("the minimum number is " +
                numbers[indexOfSmallestElement(numbers)] + " index " +
                indexOfSmallestElement(numbers));
    }
    public static int indexOfSmallestElement(double[] array) {
        if (array.length <= 1)
            return 0;

        double min = array[0];
        int minimumindex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minimumindex = i;
            }
        }
        return minimumindex;
    }
}
