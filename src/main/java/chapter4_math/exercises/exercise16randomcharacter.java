package chapter4_math.exercises;

public class exercise16randomcharacter {
    public static void main(String[] args) {
        //generate a random number between 65 and 90
        int number = 65 + (int)(Math.random() * (91 - 65));

        //display a random uppercase latter
        System.out.println((char)(number));
    }
}
