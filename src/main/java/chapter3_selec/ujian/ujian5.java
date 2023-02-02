package chapter3_selec.ujian;

import java.util.Scanner;

public class ujian5 {
    public static void main(String[] args) {
        double nilai = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Aplikasi penilaian (Rentang nilai 0 - 100");

        System.out.print("masukan nilai kehadiran : ");
        int kehadiran = input.nextByte();
        System.out.print("masukan nilai tugas : ");
        int tugas = input.nextByte();
        System.out.print("masukan nilai UTS : " );
        int uts = input.nextByte();
        System.out.print("msaukan nilai UAS : ");
        int uas = input.nextByte();
        System.out.print("masukan nilai project akhir : ");
        int akhir = input.nextByte();


        nilai = 0.05* kehadiran + 0.20 * tugas + 0.30 * akhir + 0.20 * uts + 0.25 * uas;
        System.out.println("");


        //kondisi
        if( nilai >= 90 ) {
            System.out.println("selamat anda lulus dengan nilai A");
        }else if(nilai >= 85 ) {
            System.out.println("selamat anda lulus dengan nilai B+");
        }else if(nilai >= 80 ) {
            System.out.println("selamat anda lulus dengan nilai B");
        }else if(nilai >= 75 ) {
            System.out.println("selamat anda lulus dengan nilai B-");
        }else if(nilai >= 70 ) {
            System.out.println("selamat anda lulus dengan nilai C+");
        }else if(nilai >= 65 ) {
            System.out.println("selamat anda lulus dengan nilai C");
        }else if(nilai >= 60 ) {
            System.out.println("selamat anda lulus dengan nilai C-");
        }else if(nilai > 50 ) {
            System.out.println("nilai anda D di nyatakan tidak lulus");
            System.out.println("anda harus mengulang matakuliah ini");
        }else{
            System.out.println("nilai anda E dinyatakan tidak lulus");
            System.out.println("anda harus mengulang matakuliah ini");
        }
    }
}