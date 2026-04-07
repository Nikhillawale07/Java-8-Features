
import java.util.*;

public class StreamApi {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Before Java 8
        for (int i : list) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("==== Java 8 ====");

        // Java 8
        list.stream()
                .filter(i -> i % 2 == 0) // .forEach(System.out::println);
                .forEach(x -> System.out.println(x));
    }
}

// Used for filtering, mapping
// Supports parallel processing
// Used for processing collections (filter, map, sort, etc.)

