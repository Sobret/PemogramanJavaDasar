package chapter10_object_oriented.ujian;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Kurakura {

    int tinggi;
    int berat;
    int umur;
    double tumbuh;

};
class jawaban1{
    public static void main(String[] args) {

        Kurakura kura1 = new Kurakura();

        kura1.tinggi = 5;
        kura1.berat = 5;
        kura1.umur = 5;
        kura1.tumbuh = 781.25;

        System.out.println("Larinya sangat lambat");
        System.out.println("Makanya ikan kecil");
        System.out.println("Termasuk kedalam karnivora");
        System.out.println("Rumahnya selalu dibawa");
        System.out.println("Umur kura kura adalah : " + kura1.umur + " Tahun");
        System.out.println("Masa tumbuhnya adalah : " + kura1.tumbuh);
    }
}
