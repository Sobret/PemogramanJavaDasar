package chapter17_binary.exercise;

import java.io.*;
import java.util.*;
public class exercise1createatextfile {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();

        File file = new File("exercise17_01.txt");
        if (file.exists()) {
            try (
                    Scanner input = new Scanner(file);
            ) {
                while (input.hasNext()) {
                    list.add(input.nextLine());
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            list.add(((int)(Math.random() * 100)) + " ");
        }
        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            for (String l: list) {
                output.print(l);
            }
        }
    }
}
