package chapter7_single_dimensi.latihan;

public class listing6 {
    public static int LinearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list [i])
                return i;
        }
        return -1;

    }
}
