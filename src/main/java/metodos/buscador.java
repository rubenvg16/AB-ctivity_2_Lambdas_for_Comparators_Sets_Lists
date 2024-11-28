package metodos;

import java.util.*;

public class buscador {


    public static List<Integer> findLongest(HashSet<List<Integer>> sets) {
        return sets.stream().reduce(Collections.emptyList(),
                (a, b) -> a.size() >= b.size() ? a : b);
    }
}
