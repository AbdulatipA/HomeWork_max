package org.example.typeofClasses.innerClass.Car;

public class Car {
    boolean isEngineStarted = false;

    public class Engine{
        boolean startEngine(){
            return isEngineStarted = true;
        };
    }

    @Override
    public String toString() {
        return "Car: " + "isEngineStarted = " + isEngineStarted;
    }
}
