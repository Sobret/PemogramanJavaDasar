package chapter12_exception_handling_taxt.exercise;

import java.io.File;

public class execise21datasorted {
    public static void main(String[] args) throws Exception {
        File file = new File("SortedString.txt");

        if (!file.exists()) {
            System.out.println(file.getName() + " does not exist");
            System.exit(0);
        }
        System.out.println("File " + file.getName());
        boolean dataSorted = true;
        String string1 = "";
        String string2 = "";

    }
}
