package chapter17_binary.exercise;
import java.io.*;
public class exercise3sumallintbinarydatafile {
    public static void main(String[] args) throws IOException {
        int sum = 0;

        try (
              DataInputStream input =
                      new DataInputStream(new FileInputStream("exercise17_03.dat"));
        ) {
            while (true)
                sum += input.readInt();
        }
        catch (EOFException ex) {
            System.out.println("sum of the integers is: " + sum);
        }
    }
}
