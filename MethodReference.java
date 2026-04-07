
import java.util.*;

public class MethodReference {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C");

        // Before Java 8
        list.forEach(s -> System.out.println(s));

        System.out.println("==== Java 8 ====");

        // Java 8
        list.forEach(System.out::println);
    }
}

// It is a shortcut for lambda expressions
// 👉 Used to refer to an existing method
