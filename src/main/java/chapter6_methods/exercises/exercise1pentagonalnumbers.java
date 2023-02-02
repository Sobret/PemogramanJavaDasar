package chapter6_methods.exercises;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class exercise1pentagonalnumbers {
    public static void main(String[] args) {
        final int NUMBER_OF_PENTAGONALS = 100; // Display the first 100 pentagonals
        final int NUMBER_PER_LINE = 10; // Display 10 number per line

        //display te first 100 pentagol numbers
        System.out.println("the first 100 pentagonal numbers, ten per line : ");
        for (int i = 1; i <=NUMBER_OF_PENTAGONALS; i++) {
            //print ten numbers per line
            if (i % NUMBER_PER_LINE == 0)
                System.out.printf("%7d\n", getPentagonalNumber(i));
            else
                System.out.printf("%7d", getPentagonalNumber(i));
        }
    }
    public static int getPentagonalNumber(int n) {
        return (n * (3 * n - 1)) / 2;
    }
}
