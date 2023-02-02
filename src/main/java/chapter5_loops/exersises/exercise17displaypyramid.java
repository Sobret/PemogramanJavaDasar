package chapter5_loops.exersises;
import java.util.Scanner;
public class exercise17displaypyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();

        for (int rows = 1; rows <= numberOfLines; rows++) {
            for (int s = numberOfLines - rows; s >= 1; s--) {
                System.out.print("  ");
            }

            for (int l = rows; l >= 2; l--) {
                System.out.print(l + " ");
            }

            for (int r = 1; r <= rows; r++) {
                System.out.print(r + " ");
            }

            System.out.println();
        }
    }
}
