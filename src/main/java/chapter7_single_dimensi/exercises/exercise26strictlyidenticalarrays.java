package chapter7_single_dimensi.exercises;

import java.util.Scanner;

public class exercise26strictlyidenticalarrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter list1: ");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++)
            list1[i] = input.nextInt();

        System.out.println("enter list2: ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++)
            list2[i] = input.nextInt();

        System.out.println(" two lists sre" + (equals(list1, list2) ? " " : " not ")
        + " strictly identical");
    }
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length)
            return false;

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                return false;
        }
        return true;
    }
}
