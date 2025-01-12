package org.example.CollectionsHomeWorks.Map.Task2;

import java.time.LocalDate;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Map<String, List<Game>> listGames = new HashMap<>();

        listGames.computeIfAbsent("Horror", k -> new ArrayList<>())
                .add(new Game("Dead Space", 1125.3, LocalDate.of(2008, 10, 21)));

        listGames.computeIfAbsent("Horror", k -> new ArrayList<>())
                .add(new Game("The Last of Us", 60.8, LocalDate.of(2022, 9, 2)));

        listGames.computeIfAbsent("Race", k -> new ArrayList<>())
                .add(new Game("FlatOut", 260.8, LocalDate.of(2004, 11, 5)));

        listGames.computeIfAbsent("Action-adventure", k -> new ArrayList<>())
                .add(new Game("Gta 5", 197.6, LocalDate.of(2013, 9, 17)));



//        Map<String, List<Game>> newList = listGames.entrySet().stream()
//                .map(e -> Map.entry(
//                        e.getKey(),
//                        e.getValue().stream()
//                                .filter(g -> g.getPrice() <= 300)
//                                .collect(Collectors.toList())
//                ))
//                .filter(e -> !e.getValue().isEmpty())
//                .collect(Collectors.toMap(
//                        Map.Entry :: getKey,
//                        Map.Entry :: getValue
//                ));

//        newList.forEach((k, v) -> System.out.println(k + ": " + v));

        List<Game> newList2 = listGames.values().stream()
                .flatMap(List::stream)
                .filter(e -> e.getPrice() <= 300)
                .toList();

        newList2.forEach(System.out::println);
    }
}

