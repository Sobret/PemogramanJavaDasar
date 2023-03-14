package chapter11_inheri_polymorphism.latihan;

import java.util.ArrayList;

public class listing8 {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();

        cityList.add("london");
        cityList.add("denver");
        cityList.add("paris");
        cityList.add("miami");
        cityList.add("seoul");
        cityList.add("tokyo");

        System.out.println("List size? " + cityList.size());
        System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
        System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
        System.out.println("Is the list empty? " + cityList.isEmpty());

        cityList.add(2, "xian");
        cityList.remove("miami");
        cityList.remove(1);
        System.out.println(cityList.toString());

        for (int i = cityList.size() - 1; i >= 0; i--)
        System.out.print(cityList.get(i) + " ");
        System.out.println();

        ArrayList<Circle> list = new ArrayList<>();
        list.add(new Circle(2));
        list.add(new Circle(3));

        System.out.println("The area of the circle? " + list.get(0).getArea());
    }
}
