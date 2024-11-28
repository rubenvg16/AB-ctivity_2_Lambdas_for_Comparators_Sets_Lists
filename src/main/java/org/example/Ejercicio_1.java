package org.example;

import java.util.*;

public class Ejercicio_1 {
    public static void main(String[] args) {
        int target = 25;

        Comparator<Integer> closestComparator = (a, b) -> Integer.compare(
                Math.abs(a - target), Math.abs(b - target)
        );

        List<Integer> numbers = Arrays.asList(30, 22, 28, 35, 18);
        numbers.sort(closestComparator);
        System.out.println("Sorted list: " + numbers);

        TreeSet<Integer> treeSet = new TreeSet<>(closestComparator);
        treeSet.addAll(numbers);
        System.out.println("TreeSet: " + treeSet);

        numbers.stream().sorted(closestComparator).forEach(System.out::println);
    }
}
