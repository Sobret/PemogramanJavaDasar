package chapter9_object_classes.ujian;

public class car {
    String merek;
    int prince;
    String color;

};
class identitas12{
    public static void main(String[] args) {

        car carRush = new car();
        car carAlpart = new car();

        carRush.merek = "RUSH";
        carRush.prince = 80;
        carRush.color = "yellow";

        carAlpart.merek = "ALFART";
        carAlpart.prince = 200;
        carAlpart.color = "red";

        System.out.println(carRush.merek);
        System.out.println(carRush.prince + " juta");
        System.out.println(carRush.color + "\n");
        System.out.println(carAlpart.merek);
        System.out.println(carAlpart.prince + " juta");
        System.out.println(carAlpart.color);
    }
}
