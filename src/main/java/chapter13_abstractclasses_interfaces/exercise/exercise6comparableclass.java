package chapter13_abstractclasses_interfaces.exercise;

public class exercise6comparableclass {
    public static void main(String[] args) {
        ComparableCircle comparableCircle1 = new ComparableCircle(12.5);
        ComparableCircle comparableCircle2 = new ComparableCircle(18.3);

        System.out.println("\nComparableCircle1:");
        System.out.println(comparableCircle1);
        System.out.println("\nComparableCircle2:");
        System.out.println(comparableCircle2);

        System.out.println((comparableCircle1.compareTo(comparableCircle2) == 1
                ? "\nComparableCircle1 " : "\nComparableCircle2 ") +
                "is the larger of the two Circles");
    }
}
