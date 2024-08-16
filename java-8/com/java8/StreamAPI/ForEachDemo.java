package com.java8.StreamAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Murti");
        list.add("John");
        list.add("peter");
        list.add("Saswat");
        list.add("mac");

        for (String element: list) {
            System.out.println(element);
        }

        list.stream().forEach(s -> System.out.println(s));

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");

        map.forEach((key,value) -> System.out.println(key + ": " + value));
        map.entrySet().stream().forEach(t-> System.out.println(t));



    }
}
