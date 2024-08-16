package Collections.Streams;

import java.util.Arrays;
import java.util.List;

public class FIndFirst {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","Bob","Chiranjeet","Ravi","Tony","Aaron");

        String firstNameWithB = names.stream()
                .filter(name -> name.startsWith("A"))
                .findFirst()
                .orElse("No name found");

        System.out.println(firstNameWithB);



    }
}
