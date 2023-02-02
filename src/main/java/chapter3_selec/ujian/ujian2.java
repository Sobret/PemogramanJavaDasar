package chapter3_selec.ujian;

import java.util.Scanner;

public class ujian2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan nama bulan dalam bahasa indonesia");
        String bulan = input.next();

        System.out.println("masukan tahun");
        int tahun = input.nextInt();

        //kondisi
        boolean tahunkabisat = (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);

        switch (bulan)
        {
            case "januari":
                System.out.println
                        ("pada Bulan " + bulan + " tahun " + tahun + " ada " + ((tahunkabisat) ? "31 hari,\ntahun ini merupakan tahun kabisat ":"31 hari,\nbukan merupakan tahun kabisat ")); break;
            case "februari":
                System.out.println
                        ("pada Bulan " + bulan + " tahun " + tahun + " ada " + ((tahunkabisat) ? "29 hari,\ntahun ini merupakan tahun kabisat ":"28 hari,\nbukan merupakan tahun kabisat ")); break;
            case "maret":
                System.out.println
                        ("pada Bulan " + bulan + " tahun " + tahun + " ada " + ((tahunkabisat) ? "31 hari,\ntahun ini merupakan tahun kabisat ":"31 hari,\nbukan merupakan tahun kabisat ")); break;
            case "april":
                System.out.println
                        ("pada Bulan " + bulan + " tahun " + tahun + " ada " + ((tahunkabisat) ? "30 hari,\ntahun ini merupakan tahun kabisat ":"30 hari,\nbukan merupakan tahun kabisat ")); break;
            case "mei":
                System.out.println
                        ("pada Bulan " + bulan + " tahun " + tahun + " ada " + ((tahunkabisat) ? "31 hari,\ntahun ini merupakan tahun kabisat ":"31 hari,\nbukan merupakan tahun kabisat ")); break;
            case "juni":
                System.out.println
                        ("pada Bulan " + bulan + " tahun " + tahun + " ada " + ((tahunkabisat) ? "30 hari,\ntahun ini merupakan tahun kabisat ":"30 hari,\nbukan merupakan tahun kabisat ")); break;
            case "juli":
                System.out.println
                        ("pada Bulan " + bulan + " tahun " + tahun + " ada " + ((tahunkabisat) ? "31 hari,\ntahun ini merupakan tahun kabisat ":"31 hari,\nbukan merupakan tahun kabisat ")); break;
            case "agustus":
                System.out.println
                        ("pada Bulan " + bulan + " tahun " + tahun + " ada " + ((tahunkabisat) ? "31 hari,\ntahun ini merupakan tahun kabisat ":"31 hari,\nbukan merupakan tahun kabisat ")); break;
            case "september":
                System.out.println
                        ("pada Bulan " + bulan + " tahun " + tahun + " ada " + ((tahunkabisat) ? "30 hari,\ntahun ini merupakan tahun kabisat ":"30 hari,\nbukan merupakan tahun kabisat ")); break;
            case "oktober":
                System.out.println
                        ("pada Bulan " + bulan + " tahun " + tahun + " ada " + ((tahunkabisat) ? "31 hari,\ntahun ini merupakan tahun kabisat ":"31 hari,\nbukan merupakan tahun kabisat ")); break;
            case "november":
                System.out.println
                        ("pada Bulan " + bulan + " tahun " + tahun + " ada " + ((tahunkabisat) ? "30 hari,\ntahun ini merupakan tahun kabisat ":"30 hari,\nbukan merupakan tahun kabisat ")); break;
            case "desember":
                System.out.println
                        ("pada Bulan " + bulan + " tahun " + tahun + " ada " + ((tahunkabisat) ? "31 hari,\ntahun ini merupakan tahun kabisat ":"31 hari,\nbukan merupakan tahun kabisat "));

        }
    }
}

