package chapter7_single_dimensi.latihan;

public class listing4 {
    public static void main(String[] args) {
        char[] chars = createArray();

        System.out.println("the lowercase latter are: ");
        displayArray(chars);
        int[] counts = countLetters(chars);

        System.out.println();
        System.out.println("the occurrences of each letter are: ");
        displayCounts(counts);
    }

    public static char[] createArray() {
        char[] chars = new char[100];

        for (int i = 0; i < chars.length; i++)
            chars [i] = RandomCharacter.getRandomLowerCaseLetter();

        return chars;
    }

    public static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0)
            System.out.println(chars[i]);
            else
            System.out.print(chars[i] + " ");
        }
    }

    public static int[] countLetters(char[] chars) {
        int[] counts = new int[26];

        for (int i = 0; i < chars.length; i++)
            counts[chars[i] - 'a']++;

        return counts;
    }

    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0)
                System.out.println(counts[i] + " " + (char) (i + 'a'));
            else
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
        }

    }
}
