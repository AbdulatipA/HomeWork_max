package org.example.typeofClasses.innerClass.Car;

import org.example.typeofClasses.innerClass.Bank.BankAccount;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        Car.Engine engine = car.new Engine();
        engine.startEngine();
        System.out.println(car);
    }
}
