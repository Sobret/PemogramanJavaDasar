package chapter3_selec.ujian;

import java.util.Scanner;

public class ujian3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("nama sales");
        String nama = input.next();

        System.out.println("masukan jumlah penjualan sales hari ini : ");
        int jual = input.nextInt();
        int barang;
        int jasa;
        int komisi;

        System.out.println("=========================================");

        //kondisi
        if (jual <= 200000) {
            jasa = 10000;
            komisi = jual * 10/100;
            barang = jasa + komisi;
        }else if(jual >200000 && jual <=500000) {
            jasa = 20000;
            komisi = jual * 15/100;
            barang = jasa + komisi;
        }else{
            jasa= 30000;
            komisi = jual * 20/100;
            barang = jasa + komisi;

        }
        System.out.println("Nama Sales " + nama);
        System.out.println("Selamat, total penjualan anda hari ini adalah " + jual);
        System.out.println("Anda berhak mendapatkan komisi " + komisi + " dan uang jasa " + jasa);
        System.out.println("Total pendapatan anda  hari ini adalah " + barang);

    }
}