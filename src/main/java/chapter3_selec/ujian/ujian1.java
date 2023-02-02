package chapter3_selec.ujian;

import java.util.Objects;
import java.util.Scanner;

public class ujian1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" jenis kelamin anda : ");
        String jk = input.next();

        double berat_ideal=0;

        System.out.println("masukan tiggi badan anda dalam cm: ");
        double tinggi = input.nextDouble();

        System.out.println("masukan berat badan anda dalam kg: ");
        double berat = input.nextDouble();


        // rumus bocha
        if (Objects.equals(jk, "L")) {
            jk = "laki-laki";
            berat_ideal = (tinggi - 100) - (0.1 * (tinggi - 100));
        } else if (Objects.deepEquals(jk, "P")) {
            jk = "perempuan";
            berat_ideal = (tinggi - 100) - (0.15 * (tinggi - 100));
        } else {
            System.out.println("masukan jenis kelamin anda dengan L/P");
        }

        // RUMUS BMI
        double tinggidalamcm = tinggi/100;
        double bmi = berat / (tinggidalamcm * tinggidalamcm);

        String ket;
        if (bmi < 18.5) {
            ket = " kurus";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            ket = " normal";
        } else if (bmi >= 24.9 && bmi < 29.9) {
            ket = " kelebihan berat badan";
        } else {
            ket = " obesitas";
        }

        System.out.println("jenis kelamin anda adalah " + jk + " maka berat badan ideal anda adalah : " + berat_ideal + " kg ");
        System.out.println("nilai BMI tubuh anda adalah " + String.format("%.2f", bmi) + " maka beratbadan anda termasuk kategori :" + ket);

    }

}