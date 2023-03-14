package chapter9_object_classes.latihan;

public class listing2 {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        System.out.println("The area of the circle of radius "
                + circle1.radius + " is " + circle1.getArea());

        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle of radius "
                + circle2.radius + " is " + circle2.getArea());

        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle of radius "
                + circle3.radius + " is " + circle3.getArea());


        circle2.radius = 100;
        System.out.println("The area of the circle of radius "
                + circle2.radius + " is " + circle2.getArea());
        }
        double radius;

        listing2() {
        radius = 1;
        }
        listing2(double newRadius) {
        radius = newRadius;
        }
        double getArea() {
        return radius * radius * Math.PI;
        }
        double getPrimeter() {
            return 2 * radius * Math.PI;
        }
        void setRadius(double newRadius) {
            radius = newRadius;
        }
}
