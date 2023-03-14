package chapter12_exception_handling_taxt.exercise;
import java.util.Scanner;
public class TestBin2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary: ");
        try {
            System.out.println(exercise7numberformatexception.bin2Dec(input.nextLine()));
        }
        catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
