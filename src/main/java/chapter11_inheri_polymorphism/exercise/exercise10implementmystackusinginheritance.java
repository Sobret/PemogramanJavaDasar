package chapter11_inheri_polymorphism.exercise;
import java.util.Scanner;
public class exercise10implementmystackusinginheritance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyStack stack = new MyStack();

        System.out.print("Enter five strings: ");
        for (int i = 0; i < 5; i++) {
            stack.push(input.next());
        }
        System.out.println("Stack: " + stack.toString());
    }
}
