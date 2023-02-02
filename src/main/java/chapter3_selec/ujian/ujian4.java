package chapter3_selec.ujian;

import java.util.Objects;
import java.util.Scanner;

public class ujian4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Apakah pelanggan termasuk member (Ya/Tidak) ");
        String pelanggan = input.next();

        System.out.println("Masukan total belanja : ");
        int belanja = input.nextInt();
        int diskon = 0;
        int total = 0;
        int totalcash = 0;


        //kondisi
        if (Objects.equals(pelanggan, "ya")) {
            pelanggan = "member";
            if (belanja < 500000) {
                diskon = belanja * 2 / 100;
                total = belanja - diskon;
            } else if ((belanja > 500000)) {
                total = belanja - diskon;
                diskon = belanja * 3 / 100;
                total = belanja - diskon;
            }


        } else if (Objects.equals(pelanggan, "tidak")) {
            pelanggan = "pelanggan biasa";
            diskon = belanja * 0 / 100;
            total = belanja - diskon;
            if (belanja > 500000) {
                total = belanja - diskon;
                diskon = belanja * 2 / 100;
                total = belanja - diskon;
            } else if (belanja < 500000){
                diskon = belanja * 0/100;
            }
        }else {

        }
        System.out.println("Anda Merupakan : " + pelanggan);
        System.out.println("Total Belanja anda : " + belanja);
        if (diskon < belanja) {
            System.out.println("Selamat anda mendapat potongan harga " + diskon);
        } else if (diskon > belanja) {
            System.out.println("");
        } else {
        }
        System.out.println("Total bayar : " + total);
        System.out.println("");

        System.out.println("******* CASH SYSTEM *******");
        System.out.println("Total cash : ");
        totalcash = input.nextInt();

        if (total <= totalcash) {
            total = totalcash - total;
            System.out.println("Kembalian anda : " + total);
        } else if (total >= totalcash) {
            System.out.println("maaf jumlah yang anda bayarkan kurang");

        }
    }
}
