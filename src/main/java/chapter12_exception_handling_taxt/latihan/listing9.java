package chapter12_exception_handling_taxt.latihan;

public class listing9 {
    public static void main(String[] args) {
        try{
            method1();
        }
        catch (Exception ex) {
        }
    }
    public static void method1() throws Exception {
        try{
            method2();
        }
        catch (Exception ex) {
            throw new Exception("new info from method1", ex);
        }
    }
    public static void method2() throws Exception {
        throw new Exception("new info from method2");
    }
}
