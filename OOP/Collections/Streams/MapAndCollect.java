package Collections.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndCollect {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Raja","Sanket","Gaurav","Chinmaya","Vivek");

        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCaseNames);

        List<String> lowerCaseNames = names.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println(lowerCaseNames);
    }
}
