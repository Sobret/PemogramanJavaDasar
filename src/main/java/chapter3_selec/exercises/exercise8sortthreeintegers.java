package chapter3_selec.exercises;

import java.util.Scanner;

public class exercise8sortthreeintegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter three integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        int temp;
        if(number2 < number1 || number3 < number1)
        {
            if(number2 < number1)
            {
                temp = number1;
                number1 = number2;
                number2 = temp;
            }
            if (number3 < number1)
            {
                temp = number1;
                number1 = number3;
                number3 = temp;
            }
        }
        if(number3 <number2)
        {
            temp = number2;
            number2 = number3;
            number3 = temp;
        }

        //display numbers in accending order
        System.out.println(number1 + " " + number2 + " " + number3);
    }
}
