
import java.util.*;

class lambdaExpression {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        // Before Java 8
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println("==================================");
        // Java 8 (Lambda)
        list.forEach(i -> System.out.println(i));
    }
}

// (parameters) -> expression
// Allows writing anonymous functions (no name, no class)
// Reduce boilerplate code
// Used with Streams, Collections
//A short way to implement functional interface without creating a class.
