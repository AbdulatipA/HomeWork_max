package org.example.GenericsHomeWorks.Task2;


public class Main {
    public static void main(String[] args) {
        AnyType<Object> anyType = new AnyType();

        Human[] humanArray = {new Human("John"), new Human("Jane"), new Human("Alex")};
        Robot[] robots = {new Robot(1), new Robot(2), new Robot(3)};
        Integer[] nubArray = {1, 2, 3};
        String[] strings = {"a", "b", "c"};

        anyType.printArray(humanArray);
        anyType.printArray(robots);
        anyType.printArray(nubArray);
        anyType.printArray(strings);
    }
}


