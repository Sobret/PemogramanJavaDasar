package chapter11_inheri_polymorphism.latihan;

public class listing5 {
    public static void main(String[] args) {
        displayObject(new Circle(1));
        displayObject(new Rectangle(1, 1, "black", true));
    }
    public static void displayObject(GeometricObject object) {
        System.out.println("created on " + object.getDateCreated() + "color is " + object.getColor());
    }
}
