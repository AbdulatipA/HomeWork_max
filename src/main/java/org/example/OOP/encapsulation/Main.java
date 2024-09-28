package org.example.OOP.encapsulation;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Samsung", "89283651285");
        phone1.call("78523645789");
        phone1.call("28233625836");
//        phone1.call("282336");
        System.out.println(phone1);
    }
}
