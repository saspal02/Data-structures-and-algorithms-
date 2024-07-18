package Collections.Streams;

import java.util.Arrays;
import java.util.List;

public class CountOccurrences {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Raja", "Harry", "Drake", "Kendrick", "Harry");
        Long count = names.stream()
                .filter(name -> name.equals("Harry"))
                .count();

        System.out.println(count);
    }
}
