package chapter12_exception_handling_taxt.latihan;

public class InvalidRadiusException extends Exception {
    private double radius;
    public InvalidRadiusException(double radius) {
        super("Invalid radius " + radius);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
}
