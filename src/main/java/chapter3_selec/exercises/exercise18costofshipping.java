package chapter3_selec.exercises;

import java.util.Scanner;

public class exercise18costofshipping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the weight of thr package");
        double weight = input.nextDouble();

        if (weight > 50)
            System.out.println("the package cannot be shipped.");
        else
        {
            double costperpounds;
            if(weight > 0 && weight <= 1)
                costperpounds = 3.5;
            else if(weight <= 3)
                costperpounds = 5.5;
            else if(weight <= 10)
                costperpounds = 8.5;
            else
            costperpounds = 10.5;
            System.out.println("shipping cost of package is $" + costperpounds * weight);
        }
    }
}
