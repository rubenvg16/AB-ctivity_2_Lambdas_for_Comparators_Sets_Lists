package org.example;

import java.util.*;
import static metodos.buscador.findLongest;

public class Ejercicio_6 {
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

        System.out.println("Longest list: " + findLongest(sets));
    }
}
