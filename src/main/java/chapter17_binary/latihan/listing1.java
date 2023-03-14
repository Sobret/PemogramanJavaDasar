package chapter17_binary.latihan;
import java.io.*;
import java.io.IOException;

public class listing1 {
    public static void main(String[] args) throws IOException {
        try (
         FileOutputStream output = new FileOutputStream("temp.dat");
         ) {
            for (int i = 1; i <= 10; i++)
                output.write(i);
            }
        try (
                FileInputStream input = new FileInputStream("temp.dat");
        ) {
            int value;
            while ((value = input.read()) != -1)
            System.out.print(value + " ");
        }
    }
}
