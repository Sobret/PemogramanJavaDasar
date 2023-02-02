package chapter6_methods.exercises;

import java.util.Scanner;
public class exercise17displaymatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printMatrix(n);
    }
       public static void printMatrix(int n) {
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols ++) {

                System.out.print((int)(Math.random() * 2));
            }
            System.out.println();
        }
    }
}
