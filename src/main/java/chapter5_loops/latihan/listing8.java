package chapter5_loops.latihan;

public class listing8 {
    public static void main(String[] args) {

        float sum = 0;

        for (float i = 0.01f; i <= 1.0f; i = i + 0.01f)
            sum += i;

        System.out.println("the usm is " + sum);
    }
}
