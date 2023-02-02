package chapter3_selec.latihan;

import java.util.Scanner;

public class latihan12 {
    public static void main(String[] args) {

        int panjang, lebar;
        Scanner input = new Scanner(System.in);
        System.out.println("masukan panjang");
        panjang = input.nextInt();
        System.out.println("masukan lebar");
        lebar = input.nextInt();

        System.out.println("hasilnya adalah = " + kelilingpersegipanjang(panjang, lebar));

    }

    //rumus

    public static int kelilingpersegipanjang(int panjang,int lebar) {
        int hasil = 2 * (panjang + lebar);

        return hasil;
    }
}