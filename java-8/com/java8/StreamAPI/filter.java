package com.java8.StreamAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class filter {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("Murti");
            list.add("John");
            list.add("peter");
            list.add("Saswat");
            list.add("mac");

            Map<Integer, String> map = new HashMap<>();

            map.put(1, "a");
            map.put(2, "b");
            map.put(3, "c");
            map.put(4,"d");

            //Predicate
            list.stream().filter(t -> t.startsWith("m")).forEach(t -> System.out.println(t));
            map.entrySet().stream().filter(k ->k.getKey()%2 ==0).forEach(t-> System.out.println(t));

        }
}
