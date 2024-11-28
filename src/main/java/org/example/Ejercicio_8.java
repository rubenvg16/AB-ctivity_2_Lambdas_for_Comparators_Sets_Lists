package org.example;

import java.util.*;

public class Ejercicio_8 {
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

        Comparator<List<Integer>> bySum = Comparator.comparingInt(list -> list.stream().mapToInt(Integer::intValue).sum());
        Comparator<List<Integer>> byLength = Comparator.comparingInt(List::size);

        TreeSet<List<Integer>> treeSetBySum = new TreeSet<>(bySum);
        treeSetBySum.addAll(sets);

        TreeSet<List<Integer>> treeSetByLength = new TreeSet<>(byLength);
        treeSetByLength.addAll(sets);

        System.out.println("TreeSet by sum: " + treeSetBySum);
        System.out.println("TreeSet by length: " + treeSetByLength);
    }
}
