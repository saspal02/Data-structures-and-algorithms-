package com.java8.MapandFlatMap;

import java.util.List;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        var list = List.of(2, 10, 15, 1, 9);

        list.stream()
                .flatMap(i -> Stream.of(i + 10, i + 20))
                .forEach(System.out::println);
    }
}


