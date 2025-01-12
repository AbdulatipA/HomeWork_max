package org.example.CollectionsHomeWorks.Map.Task2;

import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "a", 1,
                "b", 2,
                "c", 3
        );


        List<String> line = map.keySet().stream().sorted().toList();
        System.out.println(line);
    }
}
