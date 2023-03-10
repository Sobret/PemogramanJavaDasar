package chapter6_methods.exercises;

import chapter6_methods.latihan.listing10;

public class exercise38generaterandomcharacters {
    public static void main(String[] args) {
        final int NUMNBER_OF_UPPERCASE_LETTERS = 100;
        final int NUMNBER_OF_SINGLE_DIGITS = 100;
        final int NUMBERS_PER_LINE = 10;

        listing10 RandomCharacter = null;
        for (int i = 1; i <= NUMNBER_OF_UPPERCASE_LETTERS; i++) {
            System.out.print(RandomCharacter.getRandomUpperCaseLetter());
            System.out.print(i % NUMBERS_PER_LINE == 0 ? "\n" : " ");
        }

        for (int i = 1; i <= NUMNBER_OF_SINGLE_DIGITS; i++) {
            System.out.print(RandomCharacter.getRandomDigitCharacter());
            System.out.print(i % NUMBERS_PER_LINE == 0 ? "\n" : " ");
        }
    }
}
