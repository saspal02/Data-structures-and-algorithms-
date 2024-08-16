package com.java8.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(0);
        list.add(16);
        list.add(18);

        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);

        list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));

    }
}
