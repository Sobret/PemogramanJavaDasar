package chapter12_exception_handling_taxt.exercise;

public class exercise10outofmemoryerror {
    public static void main(String[] args) {
        int length = 1200000000;
        try {
            byte[] array = new byte[length];
        }
        catch (OutOfMemoryError ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Error handled program continues... ");

    }
}
