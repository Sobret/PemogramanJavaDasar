package chapter6_methods.exercises;

public class exercise27emirpprimespelledbackward {
    public static void main(String[] args) {
        final int NUMBER_OF_EMIRPS = 100;
        final int EMIRPS_PER_LINE = 10;

        int count = 0;
        int n = 2;

        while (count < NUMBER_OF_EMIRPS) {
            if (isEmirp(n)) {
                count++;
                System.out.print(count % EMIRPS_PER_LINE == 0 ? n + "\n" : n + " ");
            }
            n++;
        }
    }
    public static boolean isEmirp(int num) {
        exercise10primemethod PrimeNumberMethod = null;
        exercise3palindromeinteger Exercise_06_03 = null;
        return PrimeNumberMethod.isPrime(num) &&
                !Exercise_06_03.isPalindrome(num) &&
                PrimeNumberMethod.isPrime(Exercise_06_03.reverse(num));
    }
}
