package chapter17_binary.exercise;
import java.io.*;
public class exercise2createbinarydatafile {
    public static void main(String[] args) throws IOException {
        try (
                FileOutputStream output =
                        new FileOutputStream("exercise17_02.dat", true);
        ) {
            for (int i = 0; i < 100; i++)
                output.write((int)(1 + Math.random() * 100));
        }
    }
}
