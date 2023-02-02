package chapter3_selec.latihan;

import java.util.Scanner;
public class latihan2 {

    public static void main(String[] args) {
        int belanja = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("masukan total belanja");

        belanja = input.nextInt();

        //kondisi
        if (belanja > 100000){
            System.out.println("kamu dapat 2 minuman");

        }else if(belanja > 50000) {
            System.out.println("kamu dapat 1 minuman");
        }else{
            System.out.println("kamu  tidak dapat bonus");
        }
    }
}