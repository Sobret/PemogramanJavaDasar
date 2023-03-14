package chapter17_binary.latihan;
import java.io.*;
public class listing5 {
    public static void main(String[] args) throws IOException {
        try (
          ObjectOutputStream output =
                        new ObjectOutputStream(new FileOutputStream("object.dat"));
        ) {
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeObject(new java.util.Date());
        }
    }
}
