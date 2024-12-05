package org.example.GenericsHomeWorks.Task3;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("A", 1);

        //получаем данные
        System.out.println("Первый тип: " + pair.getFirstType());
        System.out.println("Второй тип: " + pair.getSecondType());

        // меняем данные
        pair.setFirstType("B");
        pair.setSecondType(2);
        System.out.println("Первый тип: " + pair.getFirstType());
        System.out.println("Второй тип: " + pair.getSecondType());

    }
}



