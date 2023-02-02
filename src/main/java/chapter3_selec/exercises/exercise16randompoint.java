package chapter3_selec.exercises;

public class exercise16randompoint {
    public static void main(String[] args) {
        int width = (int)((Math.random() * (50 + 50)) -50);
        int height = (int)((Math.random() * (100 + 100)) -100);

        System.out.println("random cocordinate in ractangle centered at (0,0)");
        System.out.println("with width 100 and height 200: (" + width + ", " + height + ")");
    }
}
