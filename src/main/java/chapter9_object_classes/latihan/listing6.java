package chapter9_object_classes.latihan;

import javax.print.attribute.standard.PresentationDirection;

public class listing6 {
    double radius;

    static int numberOfObject = 0;

    listing6() {
        numberOfObject++;
    }
    listing6(double newRadius) {
        radius = newRadius;
        numberOfObject++;
    }
    static int getNumberOfObject() {
        return numberOfObject;
    }
    double getArea() {
        return radius * radius * Math.PI;
    }
}
