package com.java8.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("kiwi");
        words.add("banana");
        words.add("pineapple");

        // Create a Comparator to sort by length of strings
        Comparator<String> Length = (s1, s2) -> Integer.compare(s1.length(),s2.length());

        // Sort the list using the comparator
        words.sort(Length);

        // Print the sorted list
        System.out.println("Sorted by length: " + words);
    }
}
