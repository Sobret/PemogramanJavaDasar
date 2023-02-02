package chapter4_math.exercises;
import java.util.Scanner;
public class exercise10guessbirthday {
    public static void main(String[] args) {
        String set1 =
                " 1  3  5  7\n" +
                " 9 11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31\n";

        String set2 =
                " 1  3  5  7\n" +
                " 9 11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31\n";

        String set3 =
                " 1  3  5  7\n" +
                " 9 11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31\n";

        String set4 =
                " 1  3  5  7\n" +
                " 9 11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31\n";
        String set5 =
                " 1  3  5  7\n" +
                " 9 11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31\n";

        int day = 0;

        //create a scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to answer questions
        System.out.println("is your birthday in set1?\n");
        System.out.println(set1);
        System.out.println("\nenter Y for Yes and N for No: ");
        String s = input.nextLine();
        char answer = s.charAt(0);

        if (Character.toUpperCase(answer) == 'Y')
                day +=1;

        //prompt the user to answer questions
        System.out.println("is your birthday in set2?\n");
        System.out.println(set1);
        System.out.println("\nenter Y for Yes and N for No: ");
        s = input.nextLine();
        answer = s.charAt(0);

        if (Character.toUpperCase(answer) == 'Y')
            day +=2;

        //prompt the user to answer questions
        System.out.println("is your birthday in set3?\n");
        System.out.println(set1);
        System.out.println("\nenter Y for Yes and N for No: ");
        s = input.nextLine();
        answer = s.charAt(0);

        if (Character.toUpperCase(answer) == 'Y')
            day +=4;

        //prompt the user to answer questions
        System.out.println("is your birthday in set4?\n");
        System.out.println(set1);
        System.out.println("\nenter Y for Yes and N for No: ");
        s = input.nextLine();
        answer = s.charAt(0);

        if (Character.toUpperCase(answer) == 'Y')
            day +=8;

        //prompt the user to answer questions
        System.out.println("is your birthday in set5?\n");
        System.out.println(set1);
        System.out.println("\nenter Y for Yes and N for No: ");
        s = input.nextLine();
        answer = s.charAt(0);

        if (Character.toUpperCase(answer) == 'Y')
            day +=16;

        System.out.println("\nyour birthday is " + day + "!");
    }
}
