package chapter10_object_oriented.latihan;

import chapter10_object_oriented.exercises.StackOfIntegers;

public class listing7 {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 0; i < 10; i++)
            stack.push(i);
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }
}
