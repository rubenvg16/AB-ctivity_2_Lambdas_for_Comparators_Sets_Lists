package org.example;

import java.util.*;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Set<Integer>> lines = new ArrayList<>();

        System.out.println("Introduce varios numeros enteros (exit para parar):");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("exit")) {
                break;
            }

            Set<Integer> integers = new HashSet<>();
            for (String part : line.split(" ")) {
                if (part.matches("-?\\d+")) {
                    integers.add(Integer.parseInt(part));
                }
            }
            lines.add(integers);
        }

        lines.forEach(set -> {
            set.forEach(System.out::print);
            System.out.println();
        });
    }
}
