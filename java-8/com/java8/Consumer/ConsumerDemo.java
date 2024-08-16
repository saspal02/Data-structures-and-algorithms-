package com.java8.Consumer;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        list.stream().forEach(t -> System.out.println("Printing: "+ t));


    }
}
