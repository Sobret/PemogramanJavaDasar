package chapter17_binary.exercise;
import java.io.*;
public class exercise12combinefiles {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.out.println("usage: java exercise_17_12 sourcefile1 . . . sourcefilen targetfile");
            System.exit(0);
        }
        RandomAccessFile[] source = new RandomAccessFile[args.length - 1];

        try (
              RandomAccessFile target =
                      new RandomAccessFile(args[args.length - 1], "rw");
        ) {
            for (int i = 0; i < source.length; i++) {
                source[i] = new RandomAccessFile(args[i], "r");
            }
            for (int i = 0; i < source.length; i++) {
                byte[] b = new byte[(int)source[i].length()];
                source[i].seek(0);
                source[i].read(b);
                target.seek(target.length());
                target.write(b);
            }
        }
    }
}
