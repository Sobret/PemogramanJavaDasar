package chapter3_selec.latihan;

import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {
        int nilai = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("masaukan nilai");

        nilai = input.nextInt();

        //kondisi

        if (nilai >= 80){
            System.out.println("kamu dapat nilai A");

        }else if(nilai >= 70){
            System.out.println("kamu dapat nilai B");

        }else if(nilai >= 50){
            System.out.println("kamu dapat nilai C");

        }else{
            System.out.println("kamu dapat nilai E");
        }
    }
}