package chapter3_selec.latihan;

import java.util.Scanner;

public class latihan10 {
    public static void main(String[] args) {

        double alas, tinggi;
        Scanner input = new Scanner(System.in);
        System.out.println("masukan alas");
        alas = input.nextDouble();
        System.out.println("masukan tinggi");
        tinggi = input.nextDouble();

        System.out.println("hasilnya adalah = " + luas(alas,tinggi));

    }

    //rumus

    public static double luas(double alas, double tinggi) {
        double hasil = alas * tinggi * 1/2;

        return hasil;
    }
}