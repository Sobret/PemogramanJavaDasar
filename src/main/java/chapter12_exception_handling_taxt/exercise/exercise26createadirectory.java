package chapter12_exception_handling_taxt.exercise;
import java.util.*;
import java.io.*;
public class exercise26createadirectory {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter directory name: ");
        File dir = new File(input.next());

        if (dir.isDirectory()) {
            System.out.println("Directory already exists");
            System.exit(0);
        }
        if (dir.mkdirs()) {
            System.out.println("Directory created successfully");
        }
    }
}
