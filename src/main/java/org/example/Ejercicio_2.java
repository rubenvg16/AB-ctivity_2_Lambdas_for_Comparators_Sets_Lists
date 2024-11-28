package org.example;

import java.util.*;

public class Ejercicio_2 {
    public static void main(String[] args) {
        String input = "apple orange banana orange apple";

        Set<String> hashSet = new HashSet<>(Arrays.asList(input.split(" ")));
        hashSet.forEach(System.out::println);

        Set<String> treeSet = new TreeSet<>(Arrays.asList(input.split(" ")));
        treeSet.forEach(System.out::println);
    }
}
