package org.example;

import java.util.*;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<List<Integer>> lines = new HashSet<>();

        System.out.println("Introduce varios numeros enteros (exi):");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("exit")) {
                break;
            }

            List<Integer> integers = new ArrayList<>();
            for (String part : line.split(" ")) {
                integers.add(Integer.parseInt(part));
            }
            lines.add(integers);
        }

        lines.forEach(list -> {
            list.forEach(System.out::print);
            System.out.println();
        });
    }
}
