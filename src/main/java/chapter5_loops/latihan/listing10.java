package chapter5_loops.latihan;

public class listing10 {
    public static void main(String[] args) {
        double tuition = 10000;
        int year = 0;
        while (tuition < 20000) {
            tuition = tuition * 1.07;
            year++;
        }
        System.out.println("tuition will be doubled in " + year + " years");
        System.out.printf("tuition will be $%.2f in %1d years",
                tuition, year);
    }
}
