package org.example.GenericsHomeWorks.Task1;

public class Main {
    public static void main(String[] args) {
        Box<Object> box = new Box<>();

        Integer value = 5;
        String text = "Hello World";
        Boolean booleanValue = true;
        Car car = new Car("Lada", 2024);

        // добавляем элементы
        box.addElement(5);
        box.addElement("Hello World");
        box.addElement(true);
        box.addElement(car);

        // получаем элементы
        box.getElement(value);
        box.getElement(text);
        box.getElement(booleanValue);
        box.getElement(car);
    }
}


