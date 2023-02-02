package chapter5_loops.exersises;

public class exercise6convertfrommilerforkilometer {
    public static void main(String[] args) {

        final double KILOMETERS_PER_MILE = 1.609;

        System.out.println(
                "Miles      Kilometers   |   Kilometers     Miles     ");

        for (int m = 1, k = 20; m <= 10 && k <= 65; m++, k += 5) {
            System.out.printf(
                    "%-11d%-10.3f", m, (m * KILOMETERS_PER_MILE));
            System.out.print("   |   ");
            System.out.printf(
                    "%-15d%-6.3f\n", k, (k / KILOMETERS_PER_MILE));
        }
    }
}
