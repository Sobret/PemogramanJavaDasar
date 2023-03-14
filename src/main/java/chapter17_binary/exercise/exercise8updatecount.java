package chapter17_binary.exercise;
import java.io.*;
public class exercise8updatecount {
    public static void main(String[] args) throws IOException {
        try (
              RandomAccessFile inout =
                      new RandomAccessFile("Exercise17_08.dat", "rw");
        ) {
            if (inout.length() == 0) {
                inout.writeInt(1);
            }
            else {
                int count = inout.readInt();
                inout.seek(0);
                inout.writeInt(++count);
            }
        }
    }
}
