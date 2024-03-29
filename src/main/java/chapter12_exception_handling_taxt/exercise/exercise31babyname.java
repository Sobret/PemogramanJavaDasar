package chapter12_exception_handling_taxt.exercise;
import java.util.*;
import java.io.*;
public class exercise31babyname {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        String year = input.nextLine();

        System.out.print("Enter the gender: ");
        String gender = input.nextLine();

        System.out.print("Enter the name: ");
        String name = input.nextLine();

        ArrayList<String> list = new ArrayList<>();

        try {
            java.net.URL url = new java.net.URL(
                    "http://www.cs.armstrong.edu/liang/data/babynamesranking" +
                            year + ".txt");

            input = new Scanner(url.openStream());
            while (input.hasNext()) {
                for (int i = 0; i < 5; i++) {
                    list.add(i, input.next());
                }
                if (list.get(gender(gender)).equals(name)) {
                    System.out.println(
                            name + " is ranked #" + list.get(0) + " in year " + year);
                    System.exit(0);
                }
                list.clear();
            }
        }
        catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
        }
        catch (java.io.IOException ex) {
            System.out.println("I/O Errors: no such file");
        }

        System.out.println("The name " + name + " is not ranked in year " + year);
    }

    /** Returns the index for the corresponding gender */
    public static int gender(String gender) {
        if (gender.equals("M"))
            return 1;
        else
            return 3;
    }
}
