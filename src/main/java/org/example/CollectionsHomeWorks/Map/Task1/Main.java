package org.example.CollectionsHomeWorks.Map.Task1;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> warehouse = Map.of(
                "Iphone", 120,
                "Samsung", 421,
                "Xiaomi", 13,
                "Huawei", 76
        );

        Map<String, Integer> warehouse2 = Map.of(
                "Iphone", 24,
                "Samsung", 32,
                "Xiaomi", 88,
                "Huawei", 7,
                "Oppo", 28,
                "Honor", 35
        );

        Map<String, Integer> store = Stream.concat(warehouse.entrySet().stream(), warehouse2.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (value1, value2) -> value1 + value2
                ));

        store.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}

