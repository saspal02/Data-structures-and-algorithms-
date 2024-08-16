package com.java8.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo  {
    public static void main(String[] args) {
        Predicate <Integer> predicate = (t) -> t % 2 == 0;
        System.out.println(predicate.test(5));
        List<Integer> list = Arrays.asList(1,4,5,6,3,2);
        list.stream().filter(predicate).forEach(t -> System.out.println("print Even "+ t));
    }
}
