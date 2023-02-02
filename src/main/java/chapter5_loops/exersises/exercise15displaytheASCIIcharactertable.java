package chapter5_loops.exersises;

public class exercise15displaytheASCIIcharactertable {
    public static void main(String[] args) {

        final int NUMBER_OF_CHARACTERS_PER_LINE = 10;
        int count = 0;

        for (int i = 33; i <= 126; i++) {
            count++;

            if (count % 10 == 0)
                System.out.println((char)i);
            else
                System.out.print((char)i + " ");
        }
        System.out.println();
    }
}
