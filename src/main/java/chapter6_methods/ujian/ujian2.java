package chapter6_methods.ujian;
import java.util.Scanner;
public class ujian2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("------Bangun Ruang------");
        System.out.println("1. Tabung ");
        System.out.println("2. Bola ");
        System.out.println("3. balok ");
        System.out.println("4. kerucut ");
        System.out.println("5. prisma segitiga  ");
        System.out.println("Masukan nomer bangun ruang : ");
        int menu = input.nextInt();

        switch (menu) {

            case 1 -> {

                System.out.println("Luas P dan Volume Tabung");
               float phi = 3.14f;
               float r, tinggi, luasP, volume;

                System.out.println("Masukan jari-jari : ");
                r = input.nextFloat();

                System.out.println("Masukan tinggi : ");
                tinggi = input.nextFloat();

                luasP = 2 * phi * r * (r + tinggi);
                System.out.println("Luas permukaan Tabung : " + luasP);

                volume = phi * r * r * tinggi;
                System.out.println("Volume tabung : " + volume);
            }
            case 2 -> {

                System.out.println("Luas P dan Volume Bola");
                float phi = 3.14f;
                float r, luasP, volume;

                System.out.println("Masukan jari-jari Bola : ");
                r = input.nextFloat();

                luasP = 4 * phi * r * r;
                System.out.println("Luas permukaan Bola : " + luasP);

                volume = 4 / (float) 3 * phi * r * r * r;
                System.out.println("Volume bola : " + volume);
            }
            case 3 -> {

                System.out.println("Luas p dan Volume balok");
                float panjang, lebar, tinggi;
                float luasP, volume;

                System.out.println("Masukan panjang : ");
                panjang = input.nextFloat();

                System.out.println("Masukan lebar : ");
                lebar = input.nextFloat();

                System.out.println("Masukan tinggi : ");
                tinggi = input.nextFloat();

                luasP = 2 * (panjang * lebar * lebar * tinggi + panjang * tinggi);
                System.out.println("Luas permukaan balok : " + luasP);

                volume = panjang * lebar * tinggi;
                System.out.println("Volume balok : " + volume);
            }
            case 4 -> {
                System.out.println("Luas P dan Volume kerucut");
                float phi = 3.14f;
                float  r, tinggi, s,luasP, volume;

                System.out.println("Nilai jari-jari   : ");
                r = input.nextFloat();

                System.out.println("Nilai tinggi   : ");
                tinggi = input.nextFloat();

                System.out.println("Masukan s : ");
                s = input.nextFloat();

                luasP = phi * r * (r + s);
                System.out.println("Luas permukaan kerucut : " + luasP);

                volume = 1 /(float) 3 * phi * r * r * tinggi;
                System.out.println("Volume kerucut : " + volume);
            }

            case 5 -> {
                System.out.println("Luas P dan Volume prisma segitiga");
                float luasA, kelilingA, tinggi;
                float luasP, volume;

                System.out.println("Masukan luas alas : ");
                luasA = input.nextFloat();

                System.out.println("Masukan keliling alas : ");
                kelilingA = input.nextFloat();

                System.out.println("Masukan tinggi : ");
                tinggi = input.nextFloat();

                luasP = (2 * luasA) + (kelilingA * tinggi);
                System.out.println("Luas permukaan prisma segitiga : " + luasA);

                volume = luasA * tinggi;
                System.out.println("Volume prisma segitiga : " + volume);
            }
        }
    }
}