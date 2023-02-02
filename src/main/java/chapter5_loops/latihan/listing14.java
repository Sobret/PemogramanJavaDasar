package chapter5_loops.latihan;

import java.util.Scanner;

public class listing14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a string : ");
        String s = input.nextLine();

        int low = 0;
        int high = s.length() - 1;

        boolean isPalindrome = true;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                break;
            }
            low++;
            high--;
        }
        if (isPalindrome)
            System.out.println(s + " is s palindrome");
        else
            System.out.println(s + " is not a palindrome");
    }
}
