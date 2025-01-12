package org.example.CollectionsHomeWorks.List;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new Base().getLinkedList();
        for (int i = 1; i <= 10000000; i++) {
            list.add(i);
        }

        long startTime = System.nanoTime();
        list.remove(0);
        list.remove(list.size() - 1);

        System.out.println(list);

       long endTime = System.nanoTime();
       long totalTimeMillisecond = (endTime - startTime) / 1_000_000;
       long totalTimeSecond = (endTime - startTime) / 1_000_000_000;

       Base.printTime(totalTimeSecond, totalTimeMillisecond, endTime);
    }
}

