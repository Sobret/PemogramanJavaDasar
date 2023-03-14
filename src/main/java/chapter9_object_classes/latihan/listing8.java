package chapter9_object_classes.latihan;

public class listing8 {
    private double radius = 1;

    private static int NumberOfObjects = 0;

    public listing8() {
        NumberOfObjects++;
    }
    public listing8(double newRadius) {
        radius = newRadius;
        NumberOfObjects++;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double newRadius) { radius = (newRadius >= 0) ? newRadius : 0;
    }
    public static int getNumberOfObjects() {
        return NumberOfObjects;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
