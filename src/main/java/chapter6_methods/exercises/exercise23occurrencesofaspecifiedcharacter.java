package chapter6_methods.exercises;

import java.util.Scanner;
public class exercise23occurrencesofaspecifiedcharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(
                "Enter a string followed by a character e.g. Welcome, e : " );
        String string = input.nextLine();

        int k = string.indexOf(", ");
        String str = string.substring(0, k);
        char ch = string.charAt(k + 2);

        System.out.println(
                "The number of occurrences of \"" + ch + "\" in \'" + str + "\" is: " +
                        count(str, ch));
    }
    public static int count(String str, char a) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (a == str.charAt(i))
                count++;
        }
        return count;
    }
}
