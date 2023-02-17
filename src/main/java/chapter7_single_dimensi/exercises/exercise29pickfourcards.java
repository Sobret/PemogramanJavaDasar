package chapter7_single_dimensi.exercises;

public class exercise29pickfourcards {
    public static void main(String[] args) {
        int[] deck;
        do{
            deck = new int[52];
            pickFourCards(deck);
        } while (sum(deck) != 24);
        print(deck);
    }
    public static void pickFourCards(int[] deck) {
        for (int i = 0; i < 4; i++) {
            deck[(int)(Math.random() * 52)]++;
        }
    }
    public static int sum(int[] deck) {
        int sum = 0;
        for (int i = 0; i < deck.length; i++) {
            sum += ((i + 1) % 13) * deck[i];
        }
        return sum;
    }
    public static void print(int[] deck) {
        String[] ranks = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

        System.out.println("the number of picks that yields the sum of 24: ");
        for (int i = 0; i < deck.length; i++) {
            if (deck[i] > 0)
                System.out.println(ranks[i % 13] + " ");
        }
        System.out.println();
    }
}
