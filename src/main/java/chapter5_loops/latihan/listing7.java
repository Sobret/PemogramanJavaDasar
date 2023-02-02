package chapter5_loops.latihan;

public class listing7 {
    public static void main(String[] args) {

        System.out.println("multiplication table");
        System.out.println(" ");
        for (int j =1; j <= 9; j++)
            System.out.println("  " + j);
        System.out.println("\n________________________________");

        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " | ");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
