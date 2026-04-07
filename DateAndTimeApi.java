
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTimeApi {

    public static void main(String[] args) {

        // Java 8
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }
}

/*
LocalDate, LocalTime, and LocalDateTime are Java 8 classes used to 
handle date and time in a thread-safe and immutable way.

Immutable
 Thread-safe
Easy to use
date - HH:MM:SS
 */
