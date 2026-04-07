
import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {

        String name = null;

        // Before Java 8
        if (name != null) {
            System.out.println(name);
        }

        System.out.println("==== Java 8 ====");

        // Java 8
        Optional<String> opt = Optional.ofNullable(name);
        System.out.println(opt.orElse("Default Value"));

        // Optional class method
        // 1. ofNullable()
        Optional<String> optional = Optional.ofNullable(name);

        // 2. isPresent()
        System.out.println("Is Present: " + opt.isPresent());

        // 3. orElse()
        System.out.println("orElse: " + opt.orElse("Default Value"));

        // 4. orElseGet()
        System.out.println("orElseGet: " + opt.orElseGet(() -> "Generated Value"));

        // 5. orElseThrow()
        try {
            System.out.println("orElseThrow: "
                    + opt.orElseThrow(() -> new RuntimeException("Value not found")));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 6. of()
        Optional<String> opt2 = Optional.of("Hello");
        System.out.println("of(): " + opt2.get());

        // 7. get()
        if (opt2.isPresent()) {
            System.out.println("get(): " + opt2.get());
        }
    }
}

//Avoid NullPointerException
// Forces developer to think about null
// Used in APIs & return types
