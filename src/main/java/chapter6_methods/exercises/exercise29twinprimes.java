package chapter6_methods.exercises;

public class exercise29twinprimes {
    public static void main(String[] args) {
        System.out.println();
        for (int p = 2; p < 1000; p++) {
            if (isTwinprime(p))
                System.out.println("(" + p + ", " + (p + 2) + ")");
        }
    }
    public static boolean isTwinprime(int num) {
        exercise10primemethod PrimeNumberMethod = null;
        return PrimeNumberMethod.isPrime(num) && PrimeNumberMethod.isPrime(num + 2);
    }
}
