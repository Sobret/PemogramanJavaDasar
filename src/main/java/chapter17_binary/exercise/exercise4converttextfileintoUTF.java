package chapter17_binary.exercise;

import java.io.*;
import java.util.Scanner;
public class exercise4converttextfileintoUTF {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("usage: java Exercise_17_04 sourceFile targetfile");
            System.exit(1);
        }
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("the File " + args[0] + " does not exist.");
            System.exit(2);
        }
        try (
                Scanner input = new Scanner(file);
                DataOutputStream output =
                        new DataOutputStream(new FileOutputStream(args[1]));
        ) {
            while (input.hasNext())
                output.writeUTF(input.nextLine());
        }
    }
}
