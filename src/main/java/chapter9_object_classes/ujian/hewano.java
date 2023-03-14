package chapter9_object_classes.ujian;

import chapter10_object_oriented.ujian.Kurakura;

public class hewano {

    double tinggi = 20;
    double berat = 4;
    int umur;

    hewano(int umur) {
        this.umur = umur;
    }

    void Makan() {
        System.out.println("Makan wortel dengan menggunakan mulut");
    }

    void Jalan() {
        System.out.println("Berjalan sambil melompat");
    }

    void Lari() {
        System.out.println("Berlari dengan sangat cepat");
    }

    int getUmur() {
        return umur;
    }

    double getBerat() {
        return berat;
    }

    double getTinggi() {
        return tinggi;
    }

    class Keluncu {
        public static void main(String[] args) {

            hewano keluncu = new hewano(4);
            keluncu.Makan();
            keluncu.Jalan();
            keluncu.Lari();

            System.out.println("Umur kelinci adalah " + keluncu.getUmur() + " tahun");


            System.out.println("indeks masa tubuhnya adalah" );
        }

    }
}