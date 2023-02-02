package chapter3_selec.latihan;
import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args) {
        int belanja = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("masukan total belanja");

        belanja = input.nextInt();

        //kondisi
        if (belanja > 70000){
            System.out.println("anda mendapatkan bonus" + belanja);
        }else{
            System.out.println("tidak mendapatkan bonus");
        }

    }
}
