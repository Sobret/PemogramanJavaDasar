package chapter2_elementary.exercises;
import java.util.Scanner;

public class exercise3ConvrtFeetIntroMtr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double METERS_PER_FOOT = 0.305;

        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        double meters = feet * METERS_PER_FOOT;

        System.out.println(feet + " feet is " + meters + " meters");
    }
}
