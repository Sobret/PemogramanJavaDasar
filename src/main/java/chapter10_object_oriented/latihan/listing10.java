package chapter10_object_oriented.latihan;

import java.util.Scanner;

public class listing10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a string: ");
        String s = input.nextLine();
        System.out.println("Ignoring nonalphanumeric characters, \nis "
                + s + " a palindrome? " + isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        String s1 = filter(s);
        String s2 = reverse(s1);
        return s2.equals(s1);
    }
    public static String filter(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
    public static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
