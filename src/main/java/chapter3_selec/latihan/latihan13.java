package chapter3_selec.latihan;

import java.util.Scanner;

public class latihan13 {
    public static void main(String[] args) {

        int angka = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("masukan angka");

        angka = input.nextInt();

        if (angka == 1) {
            System.out.println("satu");

        }else if(angka == 2) {
            System.out.println("dua");

        }else if(angka == 3) {
            System.out.println("tiga");

        }else if(angka == 4) {
            System.out.println("empat");

        }else if(angka == 5) {
            System.out.println("lima");

        }else{
            System.out.println("maaf angka yang anda masukan tidak terdaftar");
        }
    }
}