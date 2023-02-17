package chapter8_multidimensi.ujian;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ujian1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] nil = new int[10][10];

        System.out.println("\nProgram Aplikasi Rekap Nilai");
        System.out.print("Masukan jumlah siswa: ");
        String[] siswa = new String[input.nextInt()];
        System.out.print("Masukan jumlah mata pelajaran: ");
        String[] pelajaran = new String[input.nextInt()];
        double nilai;

        System.out.println("\n *** INPUT MATA PELAJARAN *** ");
        for (int i = 0; i < pelajaran.length; i++) {
            System.out.print("Masukan mata pelajaran " + (i + 1) + ": ");
            pelajaran[i] = input.next();
        }
        System.out.println("\n*** INPUT SISWA DAN NILAI SETIAP MATA PELAJARA *** ");
        for (int i = 0; i < siswa.length; i++) {
            System.out.print("Masukan nama siswa " + (i + 1) + ": ");
            siswa[i] = input.next();
            for (int j = 0; j < pelajaran.length; j++) {

                System.out.print("Masukan nilai " + pelajaran[j] + ": ");
                int[] jml = new int[input.nextInt()];
            }
        }
            System.out.print("\n *** DATA NILAI SISWA *** \n");
            System.out.print("----------------------------------------------------------------------------------------------------------------------------" +
                    "\n No  | NamaSiswa  | Matematika |   Fisika   |   Biologi  |    Kimia   | Informatika|  Rata-rata |    Index   | Keterangan    \n" +
                    "----------------------------------------------------------------------------------------------------------------------------\n");

            for (int i = 0; i < siswa.length; i++) {
                System.out.print((i + 1) + "    |        " + siswa[i] + " |  ");
                for ( int j = 0; j < 7; j++) {
                    System.out.print(nil[i][j] + "         |  ");
                }
                nilai = 0.1 * nil [i][0] + 0.2 * nil [i][1] + 0.3 * nil [i][2] + 0.4 * nil [i][3] + 0.5 * nil [i][4];
                //kondisi
                if (nilai >= 80) {
                    System.out.println("Lulus dengan pujian");
                }else if (nilai >= 70) {
                    System.out.println("Lulus");
                }else if (nilai >= 60) {
                    System.out.println("Lulus");
                }else if (nilai >= 50) {
                    System.out.println("Lulus dengan pertimbangan");
                }else{
                    System.out.println("Tidak lulus");
                }
            }
    }
}
