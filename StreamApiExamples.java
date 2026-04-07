
import java.util.*;
import java.util.stream.*;

public class StreamApiExamples {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 2, 6);

        // ================= INTERMEDIATE OPERATIONS =================
        List<Integer> result = list.stream()
                // filter() → select elements based on condition
                .filter(i -> i % 2 == 0)
                // map() → transform each element
                .map(i -> i * 2)
                // distinct() → remove duplicates
                .distinct()
                // sorted() → sort elements (ascending)
                .sorted()
                // limit() → take first N elements
                .limit(3)
                // skip() → skip first N elements
                .skip(1)
                // collect() → convert stream to List
                .collect(Collectors.toList());

        System.out.println("Result List: " + result);

        // ================= TERMINAL OPERATIONS =================
        // forEach() → iterate and print elements
        list.stream().forEach(i -> System.out.print(i + " "));
        System.out.println();

        // count() → count number of elements
        long count = list.stream().count();
        System.out.println("Count: " + count);

        // findFirst() → get first element
        Optional<Integer> first = list.stream().findFirst();
        System.out.println("First: " + first.get());

        // findAny() → get any element (useful in parallel)
        Optional<Integer> any = list.stream().findAny();
        System.out.println("Any: " + any.get());

        // anyMatch() → check if any element matches condition
        boolean anyMatch = list.stream().anyMatch(i -> i > 4);
        System.out.println("Any > 4: " + anyMatch);

        // allMatch() → check if all elements match condition
        boolean allMatch = list.stream().allMatch(i -> i > 0);
        System.out.println("All > 0: " + allMatch);

        // noneMatch() → check if no element matches condition
        boolean noneMatch = list.stream().noneMatch(i -> i < 0);
        System.out.println("None < 0: " + noneMatch);

        // reduce() → reduce elements to single value (sum)
        int sum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);

        // ================= PARALLEL STREAM =================
        // parallelStream() → process elements in parallel (multi-threading)
        list.parallelStream().forEach(i -> System.out.print(i + " "));
    }
}
