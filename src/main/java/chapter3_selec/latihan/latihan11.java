package chapter3_selec.latihan;

import java.util.Scanner;

public class latihan11 {
    public static void main(String[] args) {

        int panjang, lebar;
        Scanner input = new Scanner(System.in);
        System.out.println("masukan panjang");
        panjang = input.nextInt();
        System.out.println("masukan lebar");
        lebar = input.nextInt();

        System.out.println("hasilnya adalah : " + luaspersegipanjang(panjang, lebar));

    }

    //rumus

    public static int luaspersegipanjang(int panjang, int lebar){
        int hasil = panjang * lebar;

        return hasil;
    }
}