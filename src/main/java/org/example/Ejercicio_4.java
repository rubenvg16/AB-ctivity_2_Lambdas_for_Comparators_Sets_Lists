package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<List<Integer>> lines = new HashSet<>();

        System.out.println("Introduce varios lineas de texto (exit para parar):");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("exit")) {
                break;
            }

            List<Integer> integers = Arrays.stream(line.split(" "))
                    .filter(s -> s.matches("-?\\d+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            lines.add(integers);
        }

        lines.forEach(list -> {
            list.forEach(System.out::print);
            System.out.println();
        });
    }
}
