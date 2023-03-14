package chapter12_exception_handling_taxt.exercise;
import java.util.*;
import java.io.*;
public class exercise30occurrencesofeachletter {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(getFileName());

        if (!file.exists()) {
            System.out.println("File " + file.getName() + " does not exist");
            System.exit(0);
        }
        int[] count = new int[26];
        try (
                Scanner input = new Scanner(file);
        ) {

            while (input.hasNext()) {
                String line = (input.nextLine()).toUpperCase();
                countLetters(count, line);
            }
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println("Number of " + (char)('A' + i) + "\'s: " + count[i]);
        }
    }
    public static void countLetters(int[] count, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                count[(int)(str.charAt(i) - 'A')]++;
        }
    }
    public static String getFileName() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a filename: ");
        return input.next();
    }
}
