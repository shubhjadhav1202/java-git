import java.util.ArrayList;
import java.util.List;

public class demo {

    // Simple method: returns the square of a number
    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        // 1. Hello World
        System.out.println("Hello, World!");

        // 2. Variables and arithmetic
        int a = 5, b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a * b = " + (a * b));

        // 3. Loop with a method call
        System.out.println("Squares of 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " -> " + square(i));
        }

        // 4. Collections
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // 5. Conditional
        if (fruits.size() > 2) {
            System.out.println("We have more than 2 fruits!");
        }
    }
}