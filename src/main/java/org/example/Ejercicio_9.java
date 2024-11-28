package org.example;

import java.util.*;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<List<Integer>> sets = new HashSet<>();

        System.out.println("Introduce varios numeros enteros (exit para parar):");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("exit")) {
                break;
            }

            List<Integer> integers = new ArrayList<>();
            for (String part : line.split(" ")) {
                integers.add(Integer.parseInt(part));
            }
            sets.add(integers);
        }

        Comparator<List<Integer>> byLengthAndSum = Comparator
                .comparingInt(List::size)
                .thenComparing(list -> list.stream().mapToInt(Integer::intValue).sum());

        Comparator<List<Integer>> bySumAndLength = Comparator
                .comparingInt((List<Integer> list) -> list.stream().mapToInt(Integer::intValue).sum())
                .thenComparing(List::size);

        TreeSet<List<Integer>> treeSetByLengthAndSum = new TreeSet<>(byLengthAndSum);
        treeSetByLengthAndSum.addAll(sets);

        TreeSet<List<Integer>> treeSetBySumAndLength = new TreeSet<>(bySumAndLength);
        treeSetBySumAndLength.addAll(sets);

        System.out.println("TreeSet by length and sum: " + treeSetByLengthAndSum);
        System.out.println("TreeSet by sum and length: " + treeSetBySumAndLength);
    }
}
