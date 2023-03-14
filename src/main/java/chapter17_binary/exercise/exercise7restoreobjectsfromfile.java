package chapter17_binary.exercise;
import java.io.*;
public class exercise7restoreobjectsfromfile {
    public static void main(String[] args)
            throws IOException, ClassNotFoundException {
        try (
              ObjectInputStream input = new ObjectInputStream(new
                      BufferedInputStream(new FileInputStream("Exercise17_07.dat")))
        ) {
            while (true) {
                Loan loan = (Loan)input.readObject();
                System.out.println(loan);
                System.out.printf("total loan amount: $%.2f\n",
                        loan.getTotalPayment());
                System.out.println();
            }
        }
        catch (EOFException ex) {
        }
    }
}
