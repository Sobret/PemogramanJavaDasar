package chapter4_math.exercises;

import java.util.Scanner;

public class exercise18studnmajor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt the user to enter two character
        System.out.println("enter teo character: ");
        String str = input.nextLine();

        //extract majot and status from string
        char m = Character.toUpperCase(str.charAt(0));
        char s = str.charAt(1);

        //display the majr and status represented in the character
        switch (m)
        {
            case 'M' : System.out.println("mathematics "); break;
            case 'C' : System.out.println("computer science "); break;
            case 'I' : System.out.println("information technology"); break;
            default :
                System.out.println("invalid input");
                System.exit(1);
        }

        switch (s)
        {
            case '1' : System.out.println("freshman"); break;
            case '2' : System.out.println("sophomore"); break;
            case '3' : System.out.println("junior"); break;
            case '4' : System.out.println("senior"); break;
            default :
                System.out.println("invalid input");
        }
    }
}
