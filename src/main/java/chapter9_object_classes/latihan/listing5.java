package chapter9_object_classes.latihan;
public class listing5 {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        System.out.println("the elapsed time since jan 1, 1970 is " +
                date.getTime() + " milliseconds");
        System.out.println(date.toString());
    }
}
