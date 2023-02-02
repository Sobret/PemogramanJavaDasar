package chapter3_selec.latihan;

import java.util.Scanner;

public class latihan9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tinggi, i, j, k;

        System.out.print("input tinggi segitiga : ");
        tinggi = input.nextInt();

        System.out.println();
        for (i = 1; i <= tinggi; i++) {
            for (j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <=tinggi-i; k++) {
                System.out.print(" v");
            }
            System.out.println();
        }
    }
}
