package chapter6_methods.ujian;

import javax.sound.midi.Soundbank;
import java.util.NavigableMap;
import java.util.Scanner;

public class ujian4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println
                ("--------------------------------------------------------------" +
                 " \nSlip Gaji Karyawan Bulan Februari 2023\n" +
                 "--------------------------------------------------------------");
        String nama;
        String status;
        String anak;
        double jarak = 0;
        int masuk = 0;
        int tahun = 0;

        System.out.print("Nama Karyawan      : ");
        nama = input.nextLine();

        System.out.print("Status             : ");
        status = input.nextLine();

        System.out.print("Jumlah Anak        : ");
        anak = input.nextLine();

        System.out.print("Jarak Rmh-Kantor   : ");
        jarak = input.nextDouble();

        System.out.print("Jumlah Masuk Kerja : ");
        masuk = input.nextInt();

        System.out.print("Tahun masuk        : ");
        tahun = input.nextInt();



    }
}
