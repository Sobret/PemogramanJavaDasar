package chapter9_object_classes.latihan;

public class listing9 {
    public static void main(String[] args) {

        Circle myCircle = new Circle(5.0);
        System.out.println("the area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("the area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        System.out.println("the number of objects created is " + Circle.numberOfObjects);
    }
}
