package chapter17_binary.exercise;
import java.io.*;
public class exercise5storeobjectarrayinfile {
    public static void main(String[] args) throws IOException {
        int[] numbers = {1, 2, 3, 4, 5};

        try (
              ObjectOutputStream output = new ObjectOutputStream(new
                      FileOutputStream("exercise17_05.dat"));
        ) {
            output.writeObject(numbers);
            output.writeDouble(5.5);
            output.writeObject(new java.util.Date());
        }
    }
}
