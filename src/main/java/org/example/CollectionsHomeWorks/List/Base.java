package org.example.CollectionsHomeWorks.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Base {
    private List<Integer> arrayList = new ArrayList<>();
    private List<Integer> linkedList = new LinkedList<>();

    public List<Integer> getArrayList() {
        return arrayList;
    }
    public List<Integer> getLinkedList() {
        return linkedList;
    }


    static void printTime(long second, long millisecond, long endTime) {
        StringBuilder stringBuilder = new StringBuilder();


        while (millisecond >= 1000) {
            millisecond -= 1000;
        }

        System.out.println(" ");
        stringBuilder.append(second)
                .append(" секунд :: ")
                .append(millisecond)
                .append(" милисекунд :: ")
                .append(endTime)
                .append(" наносекунд");

        System.out.println(stringBuilder);
    }
}
