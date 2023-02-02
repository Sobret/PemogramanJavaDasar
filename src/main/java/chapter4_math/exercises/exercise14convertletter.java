package chapter4_math.exercises;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class exercise14convertletter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a letter grade A, B, C, D or F
        System.out.println("enter a letter grade: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        ch = Character.toUpperCase(ch);

        if(ch >= 'A' && ch <= 'F' && ch != 'E')
        {
            System.out.print("the numeric value for grade " + ch + " is ");
            switch (ch)
            {
                case 'A':System.out.println(4); break;
                case 'B':System.out.println(3); break;
                case 'C':System.out.println(2); break;
                case 'D':System.out.println(1); break;
                case 'F':System.out.println(0);
            }
        }
        else
            System.out.println(ch + " is an invalid grade ");
    }
}
