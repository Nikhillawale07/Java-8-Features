
import java.util.*;

public class ForEachMethodInCollection {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        // Before Java 8
        for (int i : list) {
            System.out.println(i);
        }

        System.out.println("==== Java 8 ====");

        // Java 8
        list.forEach(i -> System.out.println(i));
    }
}

// Used to iterate collection using lambda.
/* Internal iteration (handled by JVM)
Works with lambda & method reference
Available in:
Iterable
Stream

👉 Advantage
Cleaner than for loop   */
