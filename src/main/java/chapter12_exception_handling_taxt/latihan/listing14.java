package chapter12_exception_handling_taxt.latihan;

public class listing14 {
    public static void main(String[] args) throws Exception{
        java.io.File file = new java.io.File("scores.txt");
        if (file.exists()) {
            System.out.println("file already exists");
            System.exit(0);
        }
        try (
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        ) {
            output.print("john t smith ");
            output.println(90);
            output.print("eric k jones ");
            output.println(85);
        }
    }
}
