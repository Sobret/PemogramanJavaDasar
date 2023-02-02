package chapter4_math.exercises;

import java.util.Scanner;

public class exercise21checkssn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a sosial scurity number
        System.out.println("enter a SSN: ");
        String ssn = input.nextLine();

        //check whether the input is valid
        boolean isValid =
                (ssn.length() == 11) &&
                        (Character.isDigit(ssn.charAt(0))) &&
                        (Character.isDigit(ssn.charAt(1))) &&
                        (Character.isDigit(ssn.charAt(2))) &&
                        (ssn.charAt(3) == '-') &&
                        (Character.isDigit(ssn.charAt(4))) &&
                        (Character.isDigit(ssn.charAt(5))) &&
                        (Character.isDigit(ssn.charAt(7))) &&
                        (ssn.charAt(6) == '-') &&
                        (Character.isDigit(ssn.charAt(8))) &&
                        (Character.isDigit(ssn.charAt(9))) &&
                        (Character.isDigit(ssn.charAt(10)));

        //display result
        System.out.println(ssn + " is " + ((isValid) ? "a invalid " : " an invalid ")
        + "sosial scurity number");
    }
}
