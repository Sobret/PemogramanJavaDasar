package chapter11_inheri_polymorphism.exercise;

import java.util.Scanner;
import java.util.ArrayList;
public class exercise11sortarraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        sort(list);
        System.out.println(list.toString());
    }
    public static void sort(ArrayList<Integer> list) {
        java.util.Collections.sort(list);
    }
}