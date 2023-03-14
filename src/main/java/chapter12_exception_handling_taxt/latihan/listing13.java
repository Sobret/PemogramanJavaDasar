package chapter12_exception_handling_taxt.latihan;

public class listing13 {
    public static void main(String[] args) throws java.io.IOException{
        java.io.File file = new java.io.File("scores.txt");
        if (file.exists()) {
            System.out.println("file already exists");
            System.exit(1);
        }
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        output.print("john T Smith ");
        output.println(90);
        output.print("eric K Jones ");
        output.println(85);
        output.close();
    }
}
