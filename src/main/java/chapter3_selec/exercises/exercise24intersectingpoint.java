package chapter3_selec.exercises;

public class exercise24intersectingpoint {
    public static void main(String[] args) {
        int rank = (int)((Math.random() * (14 - 1)) + 1);

        int suit = (int)(Math.random() * 4);

        System.out.println("the card you picked is");
        switch (rank)
        {
            case 1: System.out.println("ace"); break;
            case 2: System.out.println(rank); break;
            case 3: System.out.println(rank); break;
            case 4: System.out.println(rank); break;
            case 5: System.out.println(rank); break;
            case 6: System.out.println(rank); break;
            case 7: System.out.println(rank); break;
            case 8: System.out.println(rank); break;
            case 9: System.out.println(rank); break;
            case 10: System.out.println(rank); break;
            case 11: System.out.println("jack"); break;
            case 12: System.out.println("queen"); break;
            case 13: System.out.println("king");
        }
        System.out.println("of");
        switch (suit)
        {
            case 0: System.out.println("clubs"); break;
            case 1: System.out.println("diamonds"); break;
            case 2: System.out.println("hearts"); break;
            case 3: System.out.println("speades");
        }
    }
}
