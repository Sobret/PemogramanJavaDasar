package chapter6_methods.ujian;
import java.util.Scanner;
public class ujian2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            float jari2, tinggi, lp, vt;
            System.out.println("Nilai jari-jari :");
            jari2 = input.nextFloat();

            System.out.println("Nilai tinggi :");
            tinggi = input.nextFloat();

            lp = 2 * 3.14f * jari2 * (jari2 + tinggi);
            vt = 3.14f * jari2 * 2 * tinggi;

            System.out.println("Luas Permukaan Tabung : " + lp);
            System.out.println("Volume Tabung : " + vt);
    }
}



