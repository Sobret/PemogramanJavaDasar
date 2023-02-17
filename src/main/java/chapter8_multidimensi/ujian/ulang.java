package chapter8_multidimensi.ujian;

import java.util.Scanner;

public class ulang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nProgram Aplikasi Rekap Nilai Siswa ");
        System.out.print("Masukan jumlah siswa: ");
        int[] jmlsiswa = new int [input.nextInt()];
        System.out.print("Masukan jumlah mata pelajaran: ");
        int[] jmlmapel = new int[input.nextInt()];

        System.out.println("\n*** INPUT MATA PELAJARAN ***");
        for (int i = 0; i < jmlmapel.length; i++) {
            System.out.print("Masukan Mata pelajaran ke" + (i + 1) + ": ");
            jmlmapel[i] = input.nextInt();
        }

    }
}
