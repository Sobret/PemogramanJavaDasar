package chapter2_elementary.ujian;
import java.util.Scanner;
public class ujian2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai Rupiah : ");

        int Rupiah = input.nextInt();

        double Dolar = 15665.50;
        double hasil = Rupiah / Dolar;

        System.out.println( Rupiah + " Rupiah adalah = " + hasil + " Dolar");
    }
}
