package org.example;

import java.util.*;

public class Ejercicio_7 {
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

        Comparator<List<Integer>> byLength = Comparator.comparingInt(List::size);
        Comparator<List<Integer>> bySum = Comparator.comparingInt(list -> list.stream().mapToInt(Integer::intValue).sum());

        List<Integer> longestList = sets.stream().max(byLength).orElse(Collections.emptyList());
        List<Integer> largestSumList = sets.stream().max(bySum).orElse(Collections.emptyList());

        System.out.println("Longest list: " + longestList);
        System.out.println("List with largest sum: " + largestSumList);
    }
}
